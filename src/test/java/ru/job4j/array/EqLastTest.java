package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEq2() {
        int[] left = {1, 2, 3, 4};
        int[] right = {1, 2, 3, 4};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEq2() {
        int[] left = {3, 3, 4};
        int[] right = {3, 3, 4, 5};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void testRightArrayIsEmpty() {
        int[] left = {1, 2, 3};
        int[] right = {};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }
}