package com.ki.level0.pl120583;

public class Main {
    public static void main(String[] args) {
        int[] number1 = {1, 1, 2, 3, 4, 5};
        int[] number2 = {0,2,3,4,};
        Solution solution = new Solution();

        System.out.println(solution.solution(number1, 1));  // 2
        System.out.println(solution.solution(number2, 1 ));  // 0

    }
}


class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
}

