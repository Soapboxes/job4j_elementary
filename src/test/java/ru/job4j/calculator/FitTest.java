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

    @Test
    public void whenHeightMan184ThenIdealWeight() {
        double height = 184;
        double expected = 96.60;
        double actual = Fit.calcManWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }

    @Test
    public void whenHeightWoman170ThenIdealWeight() {
        double height = 170;
        double expected = 69.00;
        double actual = Fit.calcWomanWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }

    @Test
    public void whenHeightManIsNegativeThenException() {
        double height = -184;
        assertThatThrownBy(() -> Fit.calcManWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }

    @Test
    public void whenHeightWomanIsNegativeThenException() {
        double height = -170;
        assertThatThrownBy(() -> Fit.calcWomanWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }
}