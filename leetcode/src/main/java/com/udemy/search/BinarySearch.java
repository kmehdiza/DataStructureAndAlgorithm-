package com.udemy.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 20, 47, 59, 65, 75, 88, 99};
        int result = binarySearch(arr, 75);
        System.out.println(result);
    }

    public static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            } else if (key < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
