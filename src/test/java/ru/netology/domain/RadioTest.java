package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void increaseVolume() {
        radio.currentVolume = 100;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.currentVolume = 3;
        radio.decreaseVolume();
        int expected = 2;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }


    @Test
    void next() {
        radio.currentChannel = 5;
        radio.next();
        int expected = 6;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }


    @Test
    void prev() {
        radio.currentChannel = 0;
        radio.prev();
        int expected = 9;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }


    @Test
    void setNewChannel() {
        radio.setNewChannel(-50);
        int expected = 0;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }
}