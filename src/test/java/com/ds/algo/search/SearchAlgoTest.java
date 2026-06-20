package com.ds.algo.search;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ds.algo.search.LinearSearchAlgorithm;


public class SearchAlgoTest{

    @org.junit.Test
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

}