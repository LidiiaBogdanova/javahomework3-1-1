package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSwitchNextRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(9);
        radio.setCurrentRadiostation(5);
        assertEquals(9, radio.getMaxRadiostation());
        radio.nextRadiostation();
        assertEquals(6, radio.getCurrentRadiostation());

    }
    @Test
    public void shouldSwitchNextRadioStationOverLimit() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(9);
        radio.setCurrentRadiostation(9);
        assertEquals(9, radio.getMaxRadiostation());
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());

    }
    @Test
    public void shouldSwitchPrevRadiostation() {
        Radio radio = new Radio();
        radio.setMinRadiostation(0);
        assertEquals(0, radio.getMinRadiostation());
        radio.setMaxRadiostation(9);
        radio.setCurrentRadiostation(5);
        assertEquals(9, radio.getMaxRadiostation());
        radio.prevRadiostation();
        assertEquals(4, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSwitchPrevRadiostationUnderLimit() {
        Radio radio = new Radio();
        radio.setMinRadiostation(0);
        assertEquals(0, radio.getMinRadiostation());
        radio.setMaxRadiostation(9);
        assertEquals(9, radio.getMaxRadiostation());
        radio.prevRadiostation();
        assertEquals(9, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldGetCurrentRadiostation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(9);
        assertEquals(9, radio.getMaxRadiostation());
        radio.setCurrentRadiostation(5);
        assertEquals(5, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldNotGetCurrentRadiostationOverLimit() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(9);
        assertEquals(9, radio.getMaxRadiostation());
        radio.setCurrentRadiostation(10);
        assertEquals(0, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldNotGetCurrentRadiostationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(-1);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void ShouldSwitchVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void ShouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void ShouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }
}

