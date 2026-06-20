package com.ds.algo.search;

import org.junit.Test;
import static org.junit.Assert.*;


public class SearchAlgoTest{

    @Test
    public void TestFindTarget(){
        // Test: target found at beginning
        int[] arr1 = {1, 2, 3, 4, 5};

        assertEquals(0, LinearSearchAlgorithm.findTargetPosition(arr1, 1));
        
        // Test: target found in middle
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(arr1, 3));
        
        // Test: target found at end
        assertEquals(4, LinearSearchAlgorithm.findTargetPosition(arr1, 5));
        
        // Test: target not found
        assertEquals(-1, LinearSearchAlgorithm.findTargetPosition(arr1, 10));
        
        // Test: single element array with target
        int[] arr2 = {7};
        assertEquals(0, LinearSearchAlgorithm.findTargetPosition(arr2, 7));
        
        // Test: single element array without target
        assertEquals(-1, LinearSearchAlgorithm.findTargetPosition(arr2, 5));
    }

    private static class SearchTestCase {
        final int[] array;
        final int target;
        final int expected;

        SearchTestCase(int[] array, int target, int expected) {
            this.array = array;
            this.target = target;
            this.expected = expected;
        }
    }

    @Test
    public void testFindTargetWithMultipleInputs() {
        SearchTestCase[] cases = {
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 1, 0),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 3, 2),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 5, 4),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 10, -1),
            new SearchTestCase(new int[]{7}, 7, 0),
            new SearchTestCase(new int[]{7}, 5, -1),
            new SearchTestCase(new int[]{2, 4, 6, 8}, 6, 2),
            new SearchTestCase(new int[]{2, 4, 6, 8}, 1, -1)
        };

        for (SearchTestCase testCase : cases) {
            int result = LinearSearchAlgorithm.findTargetPosition(testCase.array, testCase.target);
            assertEquals(
                "Failed for target " + testCase.target + " in array " + java.util.Arrays.toString(testCase.array),
                testCase.expected,
                result
            );
        }
    }

}