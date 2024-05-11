package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92Weight() {
        int in = 180;
        double expected = 92;
        double out = Fit.calcManWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69Weight() {
        int in = 170;
        double expected = 69;
        double out = Fit.calcWomanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan160Then69Weight() {
        int in = 160;
        double expected = 69;
        double out = Fit.calcManWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman150Then46Weight() {
        int in = 150;
        double expected = 46;
        double out = Fit.calcWomanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}