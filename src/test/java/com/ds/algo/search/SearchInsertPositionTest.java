package com.ds.algo.search;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;


public class SearchInsertPositionTest {

    private final SearchInsertPosition sip = new SearchInsertPosition();

    // Integer array examples (from the .md -> converted to 0-based indexes)
    @Test
    public void testInsertMiddle_int() {
        int[] arr = {10, 20, 30, 40, 50};
        // NewScoreRank = 35 -> expected insert between 30(index2) and 40(index3) => index 3
        assertEquals(3, sip.findInsertPosition(arr, 35));
    }

    @Test
    public void testTargetExists_int() {
        int[] arr = {10, 20, 30, 40, 50};
        // Target = 30 -> existing at index 2
        assertEquals(2, sip.findInsertPosition(arr, 30));
    }

    @Test
    public void testInsertBeginning_int() {
        int[] arr = {10, 20, 30, 40, 50};
        // Target = 5 -> should be inserted at index 0
        assertEquals(0, sip.findInsertPosition(arr, 5));
    }

    @Test
    public void testInsertEnd_int() {
        int[] arr = {10, 20, 30, 40, 50};
        // Target = 60 -> should be inserted at index arr.length (5)
        assertEquals(5, sip.findInsertPosition(arr, 60));
    }

    @Test
    public void testDuplicates_int() {
        int[] arr = {10, 20, 20, 20, 30};
        // Target = 20 -> lower bound (first occurrence) is index 1
        assertEquals(1, sip.findInsertPosition(arr, 20));
    }

    @Test
    public void testEmptyArray_int() {
        int[] arr = {};
        // Empty array -> insert at index 0
        assertEquals(0, sip.findInsertPosition(arr, 10));
    }

    // Generic examples

    @Test
    public void testGenericString_naturalOrder() {
        String[] arr = {"Anita", "John", "Meera", "Ravi"};
        // NewContact = "Kiran" -> between "John"(1) and "Meera"(2) => expected index 2
        // note: call the current method name in the source: findInserPostion
        assertEquals(2, sip.findInserPostion(arr, "Kiran"));
    }

    @Test
    public void testGenericInteger_withComparator() {
        Integer[] arr = {100, 200, 300, 400};
        // NewKey = 250 -> expected index 2
        assertEquals(2, sip.findInserPostion(arr, 250, Comparator.naturalOrder()));
    }

    @Test
    public void testCustomerIdExample() {
        Integer[] arr = {101, 105, 110, 115, 120};
        // NewCustomerID = 108 -> should insert between 105(index1) and 110(index2) => index 2
        assertEquals(2, sip.findInserPostion(arr, 108, Comparator.naturalOrder()));
    }
}
