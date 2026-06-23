package com.ds.algo.search;

import java.util.Comparator;

public class BinarySearchLowerBound{
    public static int findLowerBound(int[] arr, int target){
        int low =0, high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else
                low = mid + 1;
        }

        return ans;
    }

    public static <T extends Comparable<? super T>> int findLowerBound(T[] arr, T target){
        return findLowerBound(arr,target,Comparator.naturalOrder());
    }

    public static <T> int findLowerBound(T[] arr, T target, Comparator<? super T> comparator){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low ) / 2;
            int comp = comparator.compare(arr[mid],target);
            if(comp >= 0 ){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
}
