package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {


    Radio rad = new Radio();

    @Test
    void RadioTestNext() {

        int expected = 6;
        int actual = rad.setStationNext(5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestNextMax() {

        int expected = 0;
        int actual = rad.setStationNext(9);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestPrev() {

        int expected = 4;
        int actual = rad.setStationPrev(5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestPrevMin() {

        int expected = 9;
        int actual = rad.setStationPrev(0);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoice() {

        int expected = 5;
        int actual = rad.choiceStation(5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoiceMin() {

        int expected = 0;
        int actual = rad.choiceStation(-5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoiceMax() {

        int expected = 0;
        int actual = rad.choiceStation(10);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestPlus() {

        int expected = 6;
        int actual = rad.setVolumePlus(5);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestPlusMax() {

        int expected = 10;
        int actual = rad.setVolumePlus(10);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestMinus() {

        int expected = 4;
        int actual = rad.setVolumeMinus(5);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestMinusMin() {

        int expected = 0;
        int actual = rad.setVolumeMinus(0);
        assertEquals(expected, actual);
    }

}
