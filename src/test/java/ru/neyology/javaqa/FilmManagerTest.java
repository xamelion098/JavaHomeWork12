package ru.neyology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();

    @Test
    public void test0Film() {

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1Film() {

        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3Film() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Отель <<Белград>>"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3Test() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");

        String[] expected = {"Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast4Test() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");
        manager.addFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5Test() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель <<Белград>>", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast6Test() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли.Мировой тур");

        String[] expected = {"Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель <<Белград>>", "Вперёд"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast7Test() {

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель <<Белград>>");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли.Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель <<Белград>>"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);
    }

}
