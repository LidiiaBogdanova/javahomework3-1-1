package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio(10,100);

    @Test
    public void shouldSwitchNextRadioStation() {

        radio.setCurrentRadiostation(6);
        assertEquals(10, radio.getMaxRadiostation());
        radio.nextRadiostation();
        assertEquals(7, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldSwitchNextRadioStationOverLimit() {


        radio.setCurrentRadiostation(10);
        assertEquals(10, radio.getMaxRadiostation());
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldSwitchPrevRadiostation() {

        radio.setMinRadiostation(0);
        assertEquals(0, radio.getMinRadiostation());

        radio.setCurrentRadiostation(5);
        assertEquals(10, radio.getMaxRadiostation());
        radio.prevRadiostation();
        assertEquals(4, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSwitchPrevRadiostationUnderLimit() {

        radio.setMinRadiostation(0);
        assertEquals(0, radio.getMinRadiostation());

        assertEquals(10, radio.getMaxRadiostation());
        radio.prevRadiostation();
        assertEquals(10, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldGetCurrentRadiostation() {

        assertEquals(10, radio.getMaxRadiostation());
        radio.setCurrentRadiostation(5);
        assertEquals(5, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldNotGetCurrentRadiostationOverLimit() {

        assertEquals(10, radio.getMaxRadiostation());
        radio.setCurrentRadiostation(11);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldNotGetCurrentRadiostationUnderLimit() {

        radio.setCurrentRadiostation(-1);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void ShouldSwitchVolume() {

        radio.setCurrentVolume(5);

    }

    @Test
    public void ShouldIncreaseVolume() {

        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
               assertEquals(100, radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolume() {

        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void ShouldNotIncreaseVolume() {

        assertEquals(100, radio.getMaxVolume());
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void ShouldNotDecreaseVolume() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }
}

