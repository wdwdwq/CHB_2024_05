package com.ki.level0.pl120837;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(23));  // 1
        System.out.println(solution.solution(24));  // 2
        System.out.println(solution.solution(999)); // 3

    }
}


class Solution {
    public int solution(int hp) {
        int g = hp / 5;
        hp %= 5;
        int s = hp /3;
        hp %= 3;
        int w = hp;
        return g + s + w;
    }
}

