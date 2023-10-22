package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5To10() {
        int[] data = new int[] {5, 10, 9, 8, 7, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort8To12() {
        int[] data = new int[] {12, 8, 11, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 9, 10, 11, 12};
        assertThat(result).containsExactly(expected);
    }
}