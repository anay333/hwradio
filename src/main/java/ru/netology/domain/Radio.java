package ru.netology.domain;

public class Radio {

    public int currentVolume;
    public int currentChannel;
    private int maxVolume;
    private int minVolume;
    private int minChannel;
    private int maxChannel;

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getMaxChannel() {

        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {

        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {

        return minChannel;
    }

    public void setMinChannel(int minChannel) {

        this.minChannel = minChannel;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int next() {
        if (currentChannel <= 9) {
            currentChannel = currentChannel +1;
        }
        if (currentChannel == 10) {
            currentChannel = 0;
        }
        return currentChannel;
    }


    public void prev() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == 0) {
            currentChannel = 9;
        }
    }


    public void setNewChannel(int newChannel) {
        if (newChannel > 9) {
            return;
        }
        if (newChannel < 0) {
            return;
        }
        currentChannel = newChannel;
    }
}

