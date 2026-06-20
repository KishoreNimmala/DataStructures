package com.ds.algo.search;

public class BinarySearchAlgorithm {
    
    public static int findTargetPosition(int[] arrs, int target){
        int left = 0;
        int right = arrs.length - 1;
        while(left <= right){
            int mid = left + (right -left) / 2;
            
            if (arrs[mid] == target) {
                return mid;
            } else if (arrs[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1; // Target not found
    }
}
