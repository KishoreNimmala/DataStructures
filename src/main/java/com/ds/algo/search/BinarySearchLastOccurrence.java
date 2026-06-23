package com.ds.algo.search;

public class BinarySearchLastOccurrence{

    public static int findLastOccurrence(int[] arr, int target){

        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

}
