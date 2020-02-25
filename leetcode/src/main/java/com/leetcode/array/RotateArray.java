package com.leetcode.array;

public class RotateArray {

    public static void main(String[] args) {
        //[1,2,3,4,5,6,7] and k = 3
        rotate1(new int[] {1,2,3,4,5,6,7},3);
    }

    public static void rotate(int[] nums, int k) {
        int end;
        for (int i = 0; i< k;i++){
            end = nums[nums.length-1];
            for (int j =0; j<nums.length;j++){
                int temp = nums[j];
                System.out.println("temp " + temp);
                nums[j] = end;
                end = temp;
                System.out.println("end " + end);
            }
        }
        for (Integer integer: nums){
            System.out.print(integer);
        }
    }

    public static void rotate1(int[] nums, int k){

        for (;k>0;k--){
            int end = nums[nums.length-1];
            for (int i =0; i<nums.length;i++){
                int temp = nums[i];
                nums[i] = end;
                end = temp;
            }
        }

        for(Integer integer: nums){
            System.out.print(integer);
        }
    }

}
