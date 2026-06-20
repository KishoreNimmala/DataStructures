package com.ds.algo.search;


public class LinearSearchAlgorithm {

    public static int findTargetPosition(int[] arrs, int target){
        for(int i=0; i<arrs.length ; i++){
            if(arrs[i] == target)
                return i;
        }
        return -1;
    }

    public static int findTargetPosition(String[] arrs, String target){
        for(int i=0; i<arrs.length ; i++){
            if(arrs[i].equals(target))
                return i;
        }
        return -1;
    }
    
}