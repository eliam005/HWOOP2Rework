package ru.netology.javaqa.HWOOOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test

    public void shouldSetNextNumberRadio() {

        Radio radio = new Radio();
        radio.setRadiostation(1);
        radio.nextRadio();
        int actual = radio.getRadiostation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void shouldSetNextNumberRadio1() {

        Radio radio = new Radio();
        radio.setRadiostation(9);
        radio.nextRadio();
        int actual = radio.getRadiostation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void shouldSetNextNumberRadio3() {

        Radio radio = new Radio();
        radio.setRadiostation(0);
        radio.nextRadio();
        int actual = radio.getRadiostation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetNextNumberRadio4() {

        Radio radio = new Radio();
        radio.setRadiostation(8);
        radio.nextRadio();
        int actual = radio.getRadiostation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetPrevNumberRadio() {

        Radio radio = new Radio();
        radio.setRadiostation(0);
        radio.prevRadio();
        int actual = radio.getRadiostation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetPrevNumberRadio1() {

        Radio radio = new Radio();
        radio.setRadiostation(1);
        radio.prevRadio();
        int actual = radio.getRadiostation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetPrevNumberRadio2() {

        Radio radio = new Radio();
        radio.setRadiostation(9);
        radio.prevRadio();
        int actual = radio.getRadiostation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void shouldSetMaxVolume() {

        Radio radio = new Radio();
        radio.setVolume(99);
        radio.nextVolume();
        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetMaxVolume1() {

        Radio radio = new Radio();
        radio.setVolume(100);
        radio.nextVolume();
        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetMinVolume() {

        Radio radio = new Radio();
        radio.setVolume(0);
        radio.prevVolume();
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetMinVolume2() {

        Radio radio = new Radio();
        radio.setVolume(1);
        radio.prevVolume();
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetRadioInvalid() {

        Radio radio = new Radio();
        radio.setRadiostation(15);
        int actual = radio.getRadiostation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetRadioInvalid1() {

        Radio radio = new Radio();
        radio.setRadiostation(-4);
        int actual = radio.getRadiostation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetVolumeInvalid() {

        Radio radio = new Radio();
        radio.setVolume(135);
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSetVolumeInvalid1() {

        Radio radio = new Radio();
        radio.setVolume(-34);
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

}