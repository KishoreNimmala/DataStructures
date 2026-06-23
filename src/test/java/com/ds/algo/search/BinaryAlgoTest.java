package com.ds.algo.search;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryAlgoTest {

    @Test
    public void testBinarySearchNumericExamples() {
        assertEquals(3, BinarySearch.findTargetPosition(new int[]{1001, 1005, 1010, 1015, 1020, 1025}, 1015));
        assertEquals(3, BinarySearch.findTargetPosition(new int[]{101, 205, 309, 450, 512, 678}, 450));
        assertEquals(2, BinarySearch.findTargetPosition(new int[]{10001, 10015, 10023, 10045, 10078}, 10023));
        assertEquals(4, BinarySearch.findTargetPosition(new int[]{1, 5, 8, 12, 15, 20, 25}, 15));
        assertEquals(4, BinarySearch.findTargetPosition(new int[]{10, 20, 30, 40, 50, 60, 70}, 50));
        assertEquals(4, BinarySearch.findTargetPosition(new int[]{1, 5, 10, 15, 20, 25, 30}, 20));
        assertEquals(3, BinarySearch.findTargetPosition(new int[]{100, 150, 200, 250, 300, 350}, 250));
        assertEquals(-1, BinarySearch.findTargetPosition(new int[]{10, 20, 30, 40, 50, 60}, 35));
    }

    @Test
    public void testBinarySearchStringExamples() {
        assertEquals(3, BinarySearch.findTargetPosition(new String[]{"Apple", "Banana", "Cherry", "Mango", "Orange", "Peach"}, "Mango"));
        assertEquals(3, BinarySearch.findTargetPosition(new String[]{"Anita", "John", "Kiran", "Meera", "Ravi"}, "Meera"));
        assertEquals(2, BinarySearch.findTargetPosition(new String[]{"C101", "C205", "C309", "C450", "C512"}, "C309"));
        assertEquals(3, BinarySearch.findTargetPosition(new String[]{"1.0", "1.1", "1.2", "2.0", "2.1", "3.0"}, "2.0"));
    }
}
