package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {


    Radio rad = new Radio();

    @Test
    void RadioTestNext() {

        int expected = 6;
        int actual = rad.StationNext(5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestNextMax() {

        int expected = 0;
        int actual = rad.StationNext(9);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestPrev() {

        int expected = 4;
        int actual = rad.StationPrev(5);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestPrevMin() {

        int expected = 9;
        int actual = rad.StationPrev(0);
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoice() {

       rad.setChoiceStation(5);


        int expected = 5;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoiceMin() {
        rad.setChoiceStation(-1);

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void RadioTestChoiceMax() {

        rad.setChoiceStation(10);

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestPlus() {

        int expected = 6;
        int actual = rad.VolumePlus(5);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestPlusMax() {

        int expected = 10;
        int actual = rad.VolumePlus(10);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestMinus() {

        int expected = 4;
        int actual = rad.VolumeMinus(5);
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTestMinusMin() {

        int expected = 0;
        int actual = rad.VolumeMinus(0);
        assertEquals(expected, actual);
    }

}
