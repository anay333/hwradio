package ru.netology.domain;

public class Radio {

        public int currentVolume;
        public int currentChannel;
        public int newChannel;

        public void increaseVolume(int currentVolume1) {
            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
        }

        public void decreaseVolume(int currentVolume1) {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }

        public void increaseVolumeMoreThanMax(int currentVolume1) {
            if (currentVolume == 10) {
                currentVolume = currentVolume;}
        }

        public void decreaseVolumeLowThanMin(int currentVolume1) {
            if (currentVolume == 0) {
                currentVolume = currentVolume1;}
        }

        public void next(int currentChannel1) {
            if (currentChannel < 9) {
                currentChannel = currentChannel + 1;
            }
        }

        public void nextAfterMax(int currentChannel1) {
            if (currentChannel == 9) {
                currentChannel = 0;
            }
        }

        public void prev(int currentChannel1) {
            if (currentChannel > 0) {
                currentChannel = currentChannel - 1;
            }
        }

        public void prevBeforeMin(int currentChannel1) {
            if (currentChannel == 0) {
                currentChannel = 9;
            }
        }

        public void setNewChannel(int currentChannel, int newChannel) {
            currentChannel=newChannel;
        }
    }

