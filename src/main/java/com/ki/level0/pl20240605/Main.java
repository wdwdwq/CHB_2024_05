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
        //for문
//        int answer = 0;
//        if(0 < angle && angle < 90) {
//            answer = 1;
//        } else if(angle == 90) {
//            answer = 2;
//        } else if(90 < angle && angle < 180) {
//            answer = 3;
//        } else {
//            answer = 4;
//        }
//        return answer;
//    }
        //switch
        int answer = 0;
        String gak = null;
        if(0 < angle && angle < 90){
            gak = "예각";
        };
        if(angle == 90){
            gak = "직각";
        };
        if(90 < angle && angle < 180){
            gak = "둔각";
        };
        if(angle == 180){
            gak = "평각";
        };


        switch(gak){
            case "예각":
                answer = 1;
                break;
            case "직각":
                answer = 2;
                break;
            case "둔각":
                answer = 3;
                break;
            case "평각":
                answer = 4;
                break;
        }
        return answer;
    };

}

