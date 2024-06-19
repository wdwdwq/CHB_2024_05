package com.ki.level0.pl120813;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(10))); // 정답 [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(solution.solution(15))); // 정답 [1, 3, 5, 7, 9, 11, 13, 15]
    }
}

class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }
}
