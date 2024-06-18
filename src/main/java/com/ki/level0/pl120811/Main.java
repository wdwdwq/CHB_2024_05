package com.ki.level0.pl120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};

        System.out.println("array1의 중앙값: " + solution.solution(array1)); // 7
        System.out.println("array2의 중앙값: " + solution.solution(array2)); // 0
    }
}
 class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }
}
