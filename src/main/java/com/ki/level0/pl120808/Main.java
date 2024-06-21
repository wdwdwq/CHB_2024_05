package com.ki.level0.pl120808;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] answer = solution.solution(1,2,3,4);
        System.out.println(answer[0] + "/" + answer[1]);
        int[] answer2 = solution.solution(9,1,3,4);
        System.out.println(answer2[0] + "/" + answer2[1]);
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for(int i = numerator-1; i > 1; i--) {
            // 기약분수로 만들기
            if(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }

        int[] answer = { numerator, denominator };
        return answer;
    }
}

