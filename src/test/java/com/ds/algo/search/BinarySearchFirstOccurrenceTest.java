package com.ds.algo.search;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchFirstOccurrenceTest {

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
    public void testFirstOccurrenceNumericCases() {
        SearchTestCase[] cases = {
            new SearchTestCase(new int[]{101, 101, 101, 102, 103, 104}, 101, 0),
            new SearchTestCase(new int[]{200, 200, 404, 404, 404, 500}, 404, 2),
            new SearchTestCase(new int[]{100, 100, 100, 150, 200, 250}, 100, 0),
            new SearchTestCase(new int[]{70, 80, 80, 80, 90, 95}, 80, 1),
            new SearchTestCase(new int[]{30000, 40000, 40000, 40000, 50000}, 40000, 1),
            new SearchTestCase(new int[]{10, 20, 20, 20, 30, 40}, 20, 1),
            new SearchTestCase(new int[]{1, 2, 3, 3, 3, 5, 7}, 3, 2),
            new SearchTestCase(new int[]{10, 20, 30, 40, 50}, 25, -1)
        };

        for (SearchTestCase testCase : cases) {
            int result = BinarySearchFirstOccurrence.firstOccurrence(testCase.array, testCase.target);
            assertEquals(
                "Failed for target " + testCase.target + " in array " + java.util.Arrays.toString(testCase.array),
                testCase.expected,
                result
            );
        }
    }
}
