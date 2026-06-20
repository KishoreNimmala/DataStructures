package com.ds.algo.search;


public class LinearSearchAlgorithm {

    public static int findTargetPosition(int[] arrs, int target){
        for(int i=0; i<arrs.length ; i++){
            if(arrs[i] == target)
                return i;
        }
        return -1;
    }
    
}