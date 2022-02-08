package org.practice.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {
    private NQueens nQueens= new NQueens();

    @Test
    void nQueensValidCombination5() {
        int []placement = nQueens.nQueens(5);
        int[] expected = {0,2,4,1,3};
        assertArrayEquals(expected, placement);
    }

    @Test
    void nQueensValidCombination4() {
        int[] placement = nQueens.nQueens(4);
        int[] expected = {1, 3 , 0, 2};
        assertArrayEquals(expected, placement);
    }

    @Test
    void nQueensInvalidCombination2() {
        int[] placement = nQueens.nQueens(2);
        int[] expected = {-1, -1};
        assertArrayEquals(expected, placement);
    }

    @Test
    void nQueensValidCombination10() {
        int[] placement = nQueens.nQueens(10);
        int[] expected = {0, 2, 5, 7, 9, 4, 8, 1, 3, 6};
        assertArrayEquals(expected, placement);
    }
}