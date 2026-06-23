package com.ds.algo.search;

import org.junit.Test;
import static org.junit.Assert.*;


public class SearchAlgoTest{

    @Test
    public void TestFindTarget(){
        // Test: target found at beginning
        int[] arr1 = {1, 2, 3, 4, 5};

        assertEquals(0, LinearSearchAlgorithm.findTargetPosition(arr1, 1));
        
        
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

    @Test
    public void testBinarySearchWithMultipleInputs() {
        SearchTestCase[] cases = {
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 1, 0),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 3, 2),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 5, 4),
            new SearchTestCase(new int[]{1, 2, 3, 4, 5}, 10, -1),
            new SearchTestCase(new int[]{2, 4, 6, 8, 10}, 2, 0),
            new SearchTestCase(new int[]{2, 4, 6, 8, 10}, 10, 4),
            new SearchTestCase(new int[]{2, 4, 6, 8, 10}, 7, -1),
            new SearchTestCase(new int[]{1, 3, 5, 7, 9, 11}, 9, 4),
            new SearchTestCase(new int[]{1}, 1, 0),
            new SearchTestCase(new int[]{1}, 0, -1)
        };

        for (SearchTestCase testCase : cases) {
            int result = BinarySearch.findTargetPosition(testCase.array, testCase.target);
            assertEquals(
                "Binary search failed for target " + testCase.target + " in array " + java.util.Arrays.toString(testCase.array),
                testCase.expected,
                result
            );
        }
    }

    @Test
    public void testExamplesFromMarkdown() {
        // Strings examples (positions in markdown are 1-based; algorithm returns 0-based indexes)
        String[] contacts = {"Ravi", "Kiran", "Anita", "John", "Meera"};
        assertEquals(3, LinearSearchAlgorithm.findTargetPosition(contacts, "John"));

        String[] cart = {"Laptop", "Mouse", "Keyboard", "Monitor"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(cart, "Keyboard"));

        String[] students = {"Amit", "Deepak", "Rahul", "Sneha"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(students, "Rahul"));

        String[] files = {"report.docx", "notes.txt", "budget.xlsx", "presentation.pptx"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(files, "budget.xlsx"));

        String[] playlist = {"Song A", "Song B", "Song C", "Song D"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(playlist, "Song C"));

        String[] users = {"user1", "user2", "user3", "user4"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(users, "user3"));

        String[] products = {"TV", "Laptop", "Phone", "Tablet"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(products, "Phone"));

        String[] logs = {"INFO", "INFO", "WARN", "ERROR_500", "INFO"};
        assertEquals(3, LinearSearchAlgorithm.findTargetPosition(logs, "ERROR_500"));

        int[] hallTickets = {1001, 1002, 1003, 1004};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(hallTickets, 1003));

        String[] customerIDs = {"C101", "C205", "C309", "C450"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(customerIDs, "C309"));

        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(-1, LinearSearchAlgorithm.findTargetPosition(numbers, 35));

        String[] watchlist = {"ID101", "ID205", "ID307", "ID450"};
        assertEquals(2, LinearSearchAlgorithm.findTargetPosition(watchlist, "ID307"));
    }

}