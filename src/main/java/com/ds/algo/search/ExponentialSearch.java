package com.ds.algo.search;

/**
 * ExponentialSearch
 *
 * Implements Exponential (doubling) Search:
 * 1) If arr[0] == target return 0.
 * 2) Find range by increasing bound i = 1, 2, 4, 8... while i < n and arr[i] < target.
 * 3) Call binary search on range [i/2, min(i, n-1)].
 *
 * When to use:
 * - When searching in a sorted array and the target is expected to be near the front,
 *      exponential search can find the region faster than a plain binary search.
 * - Useful for unbounded/infinite-like arrays (where you can probe indexes until out-of-range).
 *
 * Complexity:
 * - Time: O(log i) where i is index of target (worst-case O(log n))
 * - Space: O(1)
 *
 * Example usage:
 *  int[] arr = {2, 3, 5, 7, 11, 13, 17};
 *  int pos = ExponentialSearch.exponentialSearch(arr, 11); // returns 4
 *
 * Implementation notes / TODOs:
 * - Provide both primitive and generic variants if needed.
 * - Decide behavior for null/empty arrays and out-of-range accesses.
 * - Add unit tests for targets at beginning, middle, end, not present, and empty arrays.
 * */

public class ExponentialSearch{

    public int findOnExponential(int[] arr, int target){
        if(arr[0] == target)
            return 0;

        int i = 1, n = arr.length;
        while(i < n && arr[i] < target )
            i = i * 2;

        int low = i / 2;
        int high = Math.min(i, n-1);

        return binarySearch(low, high, arr, target);
    }

    public int binarySearch(int low, int high, int[] arr, int target){
        while(low <= high ){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else
                high = mid - 1;
        }

        return -1;
    }

}
