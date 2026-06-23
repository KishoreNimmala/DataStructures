package com.ds.algo.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for ExponentialSearch corresponding to examples in ExponentialSearch.md.
 */
public class ExponentialSearchTest {

    private final ExponentialSearch solver = new ExponentialSearch();

    @Test
    public void testFindAtBeginning() {
        int[] arr = {2, 3, 5, 7, 11, 13};
        assertEquals(0, solver.findOnExponential(arr, 2));
    }

    @Test
    public void testFindMiddle_example() {
        int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24};
        // target = 18 -> index 8 (0-based)
        assertEquals(8, solver.findOnExponential(arr, 18));
    }

    @Test
    public void testFindAtEnd() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, solver.findOnExponential(arr, 9));
    }

    @Test
    public void testNotFound() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(-1, solver.findOnExponential(arr, 35));
    }

    @Test
    public void testLargeArrayTarget() {
        // Simulate a large sorted dataset (0 .. 99_999)
        int n = 100_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        int target = 34567;
        assertEquals(target, solver.findOnExponential(arr, target));
    }

    @Test
    public void testSingleElement_found() {
        int[] arr = {5};
        assertEquals(0, solver.findOnExponential(arr, 5));
    }

    @Test
    public void testSingleElement_notFound() {
        int[] arr = {5};
        assertEquals(-1, solver.findOnExponential(arr, 3));
    }

    @Test
    public void testTargetBeyondRange() {
        int[] arr = {1, 2, 4, 8, 16};
        assertEquals(-1, solver.findOnExponential(arr, 1000));
    }

    @Test
    public void testWithDuplicates_returnsAnyValidIndex() {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int idx = solver.findOnExponential(arr, 2);
        // algorithm may return any index where value == 2 (1..3)
        assertTrue("Expected an index between 1 and 3 but got " + idx, idx >= 1 && idx <= 3);
    }
}