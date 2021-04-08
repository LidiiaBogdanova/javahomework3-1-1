package ru.netology;

public class Radio {

    int currentRadiostation;
    int maxRadiostation;
    int minRadiostation;
    int currentVolume;
    int minVolume;
    int maxVolume;


    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation > maxRadiostation) {
            return;
        }
        if (currentRadiostation < minRadiostation) {

            return;

        }
        this.currentRadiostation = currentRadiostation;
        ;
    }

    public int getMaxRadiostation() {
        return maxRadiostation;
    }

    public void setMaxRadiostation(int maxRadiostation) {
        this.maxRadiostation = maxRadiostation;
    }

    public int getMinRadiostation() {
        return minRadiostation;
    }

    public void setMinRadiostation(int minRadiostation) {
        this.minRadiostation = minRadiostation;
    }

    public void nextRadiostation() {
        if (currentRadiostation == maxRadiostation) {
            currentRadiostation = minRadiostation;
        } else
            currentRadiostation++;
    }

    public void prevRadiostation() {
        if (currentRadiostation == minRadiostation) {
            currentRadiostation = maxRadiostation;
        } else
            currentRadiostation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

}
