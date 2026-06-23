package com.ds.algo.search;

import java.util.Comparator;

public class SearchInsertPosition{

    public int findInsertPosition(int[] arr, int target){
        int low = 0, high = arr.length -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                high = mid -1;
            }
            else
                low = mid + 1;
        }
        return low;
    }

    public <T extends Comparable<? super T >> int findInserPostion(T[] arr, T target){
        return findInserPostion(arr,target,Comparator.naturalOrder());
    }

    public <T extends Comparable<? super T >> int findInserPostion(T[] arr, T target, Comparator comparator){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int comp = comparator.compare(arr[mid], target);
            if(comp >= 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
