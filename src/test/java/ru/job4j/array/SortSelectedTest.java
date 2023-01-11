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
    public void whenSort3numbers() {
        int[] data = new int[] {8, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {15, 8, 25, 17, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 8, 15, 17, 25};
        assertThat(result).containsExactly(expected);
    }
}