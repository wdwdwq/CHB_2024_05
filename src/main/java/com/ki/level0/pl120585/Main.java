package com.ki.level0.pl120585;

public class Main {
    public static void main(String[] args) {
        int[] number1 = {149, 180, 192, 170};
        int[] number2 = {180, 120, 140};
        Solution solution = new Solution();

        System.out.println(solution.solution(number1, 167));  // 2
        System.out.println(solution.solution(number2, 190));  // 0

    }
}


class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int num : array) {
            if (num > height) {
                answer++;
            }
        }

        return answer;
    }
}

