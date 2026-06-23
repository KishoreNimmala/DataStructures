package com.ds.algo.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for BinarySearchOnAnswer implementations that correspond to examples in
 * BinarySearchOnAnswer.md (Koko Eating Bananas style, Capacity to Ship, Split Array,
 * Aggressive Cows, Allocate Books).
 */
public class BinarySearchOnAnswerTest {

    private final BinarySearchOnAnswer solver = new BinarySearchOnAnswer();

    // Koko Eating Bananas style examples
    @Test
    public void testFindPossible_koko_example1() {
        int[] piles = {3, 6, 7, 11};
        // Known example: with H = 8 hours, minimum speed is 4
        assertEquals(4, solver.findPossible(piles, 8));
    }

    @Test
    public void testFindPossible_koko_example2() {
        int[] piles = {3, 6, 7, 11};
        // With H = 4 hours, must eat at max pile speed
        assertEquals(11, solver.findPossible(piles, 4));
    }

    // Capacity To Ship Packages Within D Days examples
    @Test
    public void testShipWithinDays_standard() {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        // Known example: D = 5 -> minimum capacity = 15
        assertEquals(15, solver.shipWithinDays(weights, 5));
    }

    @Test
    public void testShipWithinDays_another() {
        int[] weights = {3,2,2,4,1,4};
        // Known example: D = 3 -> minimum capacity = 6
        assertEquals(6, solver.shipWithinDays(weights, 3));
    }

    @Test
    public void testShipWithinDays_singleDay() {
        int[] weights = {5, 10, 15};
        // D = 1 must carry everything in one day -> capacity = sum = 30
        assertEquals(30, solver.shipWithinDays(weights, 1));
    }

    // Split Array Largest Sum examples
    @Test
    public void testSplitArray_example() {
        int[] nums = {7, 2, 5, 10, 8};
        // Known example: m = 2 -> answer = 18
        assertEquals(18L, solver.splitArray(nums, 2));
    }

    @Test
    public void testSplitArray_eachElement() {
        int[] nums = {1,2,3,4,5};
        // m = nums.length -> largest sum is max element = 5
        assertEquals(5L, solver.splitArray(nums, nums.length));
    }

    // Aggressive Cows (maxMinDistance) example
    @Test
    public void testMaxMinDistance_aggressiveCows() {
        int[] stalls = {1, 2, 8, 4, 9};
        // After sorting -> [1,2,4,8,9], placing 3 cows gives max min distance = 3
        assertEquals(3, solver.maxMinDistance(stalls, 3));
    }

    // Allocate Books (wrapper around splitArray) example from the .md
    @Test
    public void testAllocateBooks_from_md() {
        int[] pages = {100, 200, 300, 400};
        // Students = 2 -> expected minimum maximum pages = 600
        assertEquals(600L, solver.allocateBooks(pages, 2));
    }
}