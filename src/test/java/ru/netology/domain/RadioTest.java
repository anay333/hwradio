package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void increaseVolume() {
        radio.currentVolume = 11;
        radio.increaseVolume(radio.currentVolume);
        int expected = 11;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.currentVolume = -2;
        radio.decreaseVolume(radio.currentVolume);
        int expected = -2;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMoreThanMax() {
        radio.currentVolume = 11;
        radio.increaseVolumeMoreThanMax(radio.currentVolume);
        int expected = 11;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeLowThanMin() {
        radio.currentVolume = -2;
        radio.decreaseVolumeLowThanMin(radio.currentVolume);
        int expected = -2;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    void next() {
        radio.currentChannel = 10;
        radio.next(radio.currentChannel);
        int expected = 10;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void nextAfterMax() {
        radio.currentChannel = 8;
        radio.nextAfterMax(radio.currentChannel);
        int expected = 8;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        radio.currentChannel = -5;
        radio.prev(radio.currentChannel);
        int expected = -5;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void prevBeforeMin() {
        radio.currentChannel = 5;
        radio.prevBeforeMin(radio.currentChannel);
        int expected = 5;
        int actual = radio.currentChannel;

        assertEquals(expected, actual);
    }

    @Test
    void setNewChannel() {
        radio.currentChannel = 5;
        radio.newChannel = 9;
        radio.setNewChannel(radio.currentChannel, radio.newChannel);
        int expected = 9;
        int actual = radio.newChannel;

        assertEquals(expected, actual);
    }
}