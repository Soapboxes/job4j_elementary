package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {7, 8, 9, 10, 5};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 8, 10, 9, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 3;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapSameElements() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 1;
        int[] expected = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, source, dest);
        assertArrayEquals(expected, result);
    }
}