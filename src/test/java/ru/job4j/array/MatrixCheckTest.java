package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontal4rowcell() {
        char[][] input = {
                {' ', ' ', ' ', 'X'},
                {'X', 'X', 'X', ' '},
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
        };
        int row = 3;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNotMonoHorizontal4rowcell() {
        char[][] input = {
                {' ', ' ', ' ', 'X'},
                {'X', 'X', 'X', ' '},
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoVertical4rowcell() {
        char[][] input = {
                {' ', ' ', ' ', 'X'},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', 'X'},
                {'X', ' ', 'X', 'X'},
        };
        int column = 3;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNotMonoVertical4rowcell() {
        char[][] input = {
                {'X', ' ', ' ', 'X'},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', 'X'},
                {'X', ' ', 'X', 'X'},
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}