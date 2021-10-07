package ru.netology.domain;

public class Radio {

    public int currentVolume;
    public int currentChannel;
    private int minVolume;
    private int maxVolume;
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

    public void setMaxChannel() {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return maxChannel;
    }

    public void setMinChannel() {
        this.minChannel = minChannel;
    }

    public void increaseVolume() {
        int minVolume=0;
        int maxVolume=10;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }

    }

    public void decreaseVolume() {
        int minVolume=0;
        int maxVolume=10;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
    }


    public void next() {
        int maxChannel=9;
        int minChannel=0;
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
    }


    public void prev() {
        int maxChannel=9;
        int minChannel=0;
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        }
    }


    public void setNewChannel(int newChannel) {
        int maxChannel=9;
        int minChannel=0;
        if (newChannel > maxChannel) {
            return;
        }
        if (newChannel < minChannel) {
            return;
        }
        currentChannel = newChannel;
    }
}

