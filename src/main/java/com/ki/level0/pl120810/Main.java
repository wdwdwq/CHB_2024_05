package com.ki.level0.pl120810;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3,2));
        System.out.println(solution.solution(10,5));
    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}