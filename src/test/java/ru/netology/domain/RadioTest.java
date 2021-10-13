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
    void increaseVolume() {
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.currentVolume = -50;
        radio.decreaseVolume();
        int expected = -50;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }


    @Test
    void next() {
        radio.currentChannel = 100;
        radio.next();
        int expected = 100;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        radio.currentChannel = 5;
        radio.prev();
        int expected = 4;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void setNewChannel() {
        radio.setNewChannel(-5);
        int expected = 0;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }
}
