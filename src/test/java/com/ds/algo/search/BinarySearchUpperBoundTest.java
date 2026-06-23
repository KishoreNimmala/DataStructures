package com.ds.algo.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchUpperBoundTest{
    private static class SearchTestCase{
        final int[] array;
        final int target;
        final int expected;

        SearchTestCase(int[] array,int target,int expected){
            this.array = array;
            this.target = target;
            this.expected = expected;
        }
    }

    @Test
    public void testUpperBoundNumericCases(){
        SearchTestCase[] cases = {new SearchTestCase(new int[]{1000,1500,2000,2500,3000},2000,3),new SearchTestCase(new int[]{30000,40000,50000,60000,70000},50000,3),new SearchTestCase(new int[]{60,70,80,90},80,3),new SearchTestCase(new int[]{5000,7000,9000,12000},9000,3),new SearchTestCase(new int[]{100,200,300,400,500},300,3),new SearchTestCase(new int[]{100,200,500,1000,2000},500,3),new SearchTestCase(new int[]{10,20,50,100},20,2),new SearchTestCase(new int[]{50,100,200,500},100,2),new SearchTestCase(new int[]{1,5,10,20,50},10,3),new SearchTestCase(new int[]{70,80,80,80,90,95},80,4),new SearchTestCase(new int[]{101,105,110,115,120},110,3),new SearchTestCase(new int[]{10,20,30,40,50},25,2),new SearchTestCase(new int[]{10,20,30,40,50},50,- 1),new SearchTestCase(new int[]{},1,- 1),new SearchTestCase(new int[]{10,20,30},5,0)};
        for (SearchTestCase tc: cases) {
            int res = BinarySearchUpperBound.findUpperBound(tc.array,tc.target);
            assertEquals("Failed for target " + tc.target + " in array " + java.util.Arrays.toString(tc.array),tc.expected,res);
        }
    }

    @Test
    public void testUpperBoundGenericCases(){
        Integer[] nums = new Integer[]{10,20,20,20,30,40};
        assertEquals(4,BinarySearchUpperBound.findUpperBound(nums,20));
        String[] slots = new String[]{"09:00","10:00","11:00","14:00"};
        assertEquals(2,BinarySearchUpperBound.findUpperBound(slots,"10:00"));
    }
}

