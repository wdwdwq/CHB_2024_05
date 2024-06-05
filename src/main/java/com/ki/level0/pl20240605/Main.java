package com.ki.level0.pl20240605;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Angle 45: " + solution.solution(45));  // 1
        System.out.println("Angle 90: " + solution.solution(90));  // 2
        System.out.println("Angle 135: " + solution.solution(135)); // 3
        System.out.println("Angle 180: " + solution.solution(180)); // 4
    }
}


class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(0 < angle && angle < 90) {
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        } else if(90 < angle && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }

}

