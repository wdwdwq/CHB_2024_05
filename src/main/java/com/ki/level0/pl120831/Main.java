package com.ki.level0.pl120831;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(4));  // 예상 출력: 6

        System.out.println(solution.solution(10)); // 예상 출력: 30
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
