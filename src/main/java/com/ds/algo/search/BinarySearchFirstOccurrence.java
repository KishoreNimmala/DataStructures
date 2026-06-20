package com.ds.algo.search;

import java.util.Comparator;

public class BinarySearchFirstOccurrence {

    public static int firstOccurrence(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int firstOccurrence(String arr[], String target) {
        return firstOccurrence(arr, target, String::compareTo);
    }

    public static <T extends Comparable<? super T>> int firstOccurrence(T arr[], T target) {
        return firstOccurrence(arr, target, Comparator.naturalOrder());
    }

    public static <T> int firstOccurrence(T arr[], T target, Comparator<? super T> comparator) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = comparator.compare(arr[mid], target);
            if (comparison == 0) {
                ans = mid;
                high = mid - 1;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
