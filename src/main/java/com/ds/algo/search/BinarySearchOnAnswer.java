package com.ds.algo.search;

import java.util.Arrays;

/**
 * BinarySearchOnAnswer
 *
 * A collection of binary search implementations and reference solutions used
 * for teaching and testing. Typical methods to include:
 *
 * - int binarySearch(int[] arr, int target)
 *     Returns the index of target or -1 if not found.
 *
 * - int lowerBound(int[] arr, int target)
 *     Returns the first index where arr[index] >= target (insert position).
 *
 * - int upperBound(int[] arr, int target)
 *     Returns the first index where arr[index] > target.
 *
 * - <T> int lowerBound(T[] arr, T target, Comparator<? super T> cmp)
 *     Generic variants using a Comparator.
 *
 * Algorithmic complexity:
 * - Time: O(log n)
 * - Space: O(1) (iterative variants)
 *
 * Example:
 *     int[] a = {10,20,30,40};
 *     // lowerBound(a, 25) -> 2
 *
 * Design considerations:
 * - Methods should be deterministic for duplicate values (choose lower/upper)
 * - Provide both primitive and generic overloads for convenience
 *
 * @author
 * @since 1.0
 */
public class BinarySearchOnAnswer {
    /**
     *  Koko Eating Bananas style:
     *  Given piles and H hours, return the minimum eating speed k such that
     *  Koko can eat all bananas in <= H hours.
     *
     *  Time: O(n log M) where M = max(piles)
     *  Space: O(1)
     *  */
    public int findPossible(int[] piles, int H){
        int low = 1;
        int high = 0;
        for(int p: piles)
            high = Math.max(high,p);
        int ans = high;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(mid,piles,H)){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }

        return ans;
    }

    private boolean isPossible(int k, int[] piles, int H){
        int hours = 0;
        for(int p: piles){
            hours += (p + k -1 ) / k;
            if(hours > H)
                return false;
        }

        return hours <= H;
    }

    /**
     * Capacity To Ship Packages Within D Days:
     * Given weights[] and D days, find minimum ship capacity to ship all within D days.
     *
     * Time: O(n log S) where S = sum(weights)
     * Space: O(1)
     * */
    public int shipWithinDays(int[] weights, int D) {
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w); // at least max single weight
            high += w;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, D, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canShip(int[] weights, int D, int capacity) {
        int days = 1;
        int current = 0;
        for (int w : weights) {
            if (current + w <= capacity) {
                current += w;
            } else {
                days++;
                current = w;
                if (days > D) return false;
            }
        }
        return true;
    }

    /**
     * Split Array Largest Sum:
     * Given nums[] and m (number of subarrays), split into at most m continuous subarrays
     * to minimize the largest subarray sum. Return that minimum largest sum.
     *
     * Time: O(n log S) where S = sum(nums)
     * Space: O(1)
     * */
    public long splitArray(int[] nums, int m) {
        long low = 0, high = 0;
        for (int x : nums) {
            low = Math.max(low, x);
            high += x;
        }
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canSplit(nums, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canSplit(int[] nums, int m, long maxAllowed) {
        int parts = 1;
        long sum = 0;
        for (int x : nums) {
            if (sum + x <= maxAllowed) {
                sum += x;
            } else {
                parts++;
                sum = x;
                if (parts > m) return false;
            }
        }
        return true;
    }

    /**
     * Aggressive Cows:
     * Given stall positions and number of cows, maximize the minimum distance between cows.
     *
     * Time: O(n log D) where D = (maxPos - minPos)
     * Space: O(1)
     * */
    public int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlaceCows(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1; // try larger distance
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int placed = 1;
        int last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= minDist) {
                placed++;
                last = stalls[i];
                if (placed >= cows) return true;
            }
        }
        return false;
    }

    /**
     * Allocate Minimum Number of Pages (book allocation) — wrapper around splitArray semantics.
     * Given pages[] and students, minimize the maximum pages assigned to any student.
     *
     * Time: O(n log S)
     * */
    public long allocateBooks(int[] pages, int students) {
        // This is identical to splitArray with m = students
        return splitArray(pages, students);
    }
}
