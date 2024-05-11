package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquareTest {
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound4Then0149() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound0ThenException() {
        int bound = 0;
        int[] expected = new int[0];
        int[] result = Square.calculate(bound);
        assertArrayEquals(expected, result);
    }
}