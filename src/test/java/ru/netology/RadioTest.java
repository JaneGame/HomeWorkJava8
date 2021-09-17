package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {


    Radio rad = new Radio();

    @Test
    void radioTestNext() {

        int expected = 6;
        int actual = rad.stationNext(5);
        assertEquals(expected, actual);
    }

    @Test
    void radioTestNextMax() {

        int expected = 0;
        int actual = rad.stationNext(9);
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrev() {

        int expected = 4;
        int actual = rad.stationPrev(5);
        assertEquals(expected, actual);
    }

    @Test
    void radioTestPrevMin() {

        int expected = 9;
        int actual = rad.stationPrev(0);
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoice() {

        rad.setChoiceStation(5);


        int expected = 5;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMin() {
        rad.setChoiceStation(-1);

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void radioTestChoiceMax() {

        rad.setChoiceStation(10);

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestPlus() {

        int expected = 6;
        int actual = rad.volumePlus(5);
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestPlusMax() {

        int expected = 10;
        int actual = rad.volumePlus(10);
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinus() {

        int expected = 4;
        int actual = rad.volumeMinus(5);
        assertEquals(expected, actual);
    }

    @Test
    void volumeTestMinusMin() {

        int expected = 0;
        int actual = rad.volumeMinus(0);
        assertEquals(expected, actual);
    }

}
