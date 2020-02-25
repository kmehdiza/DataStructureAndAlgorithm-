package com.leetcode.first20Page;

import java.util.HashMap;
import java.util.Map;

public class CountNegativeNumbersSortedMatrix {

    public int countNegative(int[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

}
