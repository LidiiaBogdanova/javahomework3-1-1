package ru.netology;

import lombok.Data;

@Data
public class Radio {

    int currentRadiostation;
    int maxRadiostation;
    int minRadiostation;
    int currentVolume;
    int minVolume;
    int maxVolume;


    public Radio(int maxRadiostation, int maxVolume) {
        this.maxRadiostation = maxRadiostation;
        this.maxVolume = maxVolume;
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

}
