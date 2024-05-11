package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.convertCurrency(in, 70f);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen2dot3333Dollars() {
        float in = 140;
        float expected = 2.3333f;
        float out = Converter.convertCurrency(in, 60f);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen10dot5263Yuan() {
        float in = 140;
        float expected = 10.5263f;
        float out = Converter.convertCurrency(in, 13.3f);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}

