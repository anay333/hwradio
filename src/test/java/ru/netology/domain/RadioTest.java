package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldGetAndSetMaxVolume() {
        int expected = 10;
        radio.setMaxVolume(expected);
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldGetAndSetMinVolume() {
        int expected = 0;
        int actual = radio.getMinVolume();
        radio.setMinVolume(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetMaxChannel() {
        int expected = 9;
        radio.setMaxChannel(expected);
        assertEquals(expected, radio.getMaxChannel());
    }

    @Test
    public void shouldGetAndSetMinChannel() {
        int expected = 0;
        radio.setMinChannel(expected);
        assertEquals(expected, radio.getMinChannel());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(-500);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentChannel() {
        radio.setCurrentChannel(50);
        int expected = 0;
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void next() {
        radio.setCurrentChannel(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        radio.setCurrentChannel(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setNewChannel() {
        radio.setNewChannel(5);
        int expected = 5;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }
}
