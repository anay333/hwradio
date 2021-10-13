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
        radio.currentVolume = 6;
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.currentVolume = -3;
        radio.decreaseVolume();
        int expected = -3;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }


    @Test
    void next() {
        radio.currentChannel = 9;
        radio.next();
        int expected = 0;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        radio.currentChannel = 6;
        radio.prev();
        int expected = 5;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void setNewChannel() {
        radio.setNewChannel(5);
        int expected = 5;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }
}
