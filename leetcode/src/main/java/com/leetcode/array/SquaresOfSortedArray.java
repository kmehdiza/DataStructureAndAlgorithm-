package com.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] A){
        int[] newArray = new int[A.length];

        for(int i =0 ; i<A.length;i++){
            int squareInteger = (int) Math.pow(A[i],2);
            System.out.println("squareInteger = " +squareInteger);
            newArray[i] = squareInteger;
        }
        Arrays.sort(newArray);
        return newArray;
    }
//{-4, -1, 0, 3, 10}

}
