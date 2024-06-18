package com.ki.level0.pl120910;

public class Main {
    // 문제 설명
    // 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    // 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
    // t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2, 10));  // Expected: 2048
        System.out.println(solution.solution(7, 15));  // Expected: 229376
    }
}

class Solution {
    public int solution(int n, int t) {
        for (int i = 1; i <= t; i++) {
            n *= 2;
        }
        return n;
    }
}
