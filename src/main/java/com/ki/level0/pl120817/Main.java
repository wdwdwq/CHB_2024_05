package com.ki.level0.pl120817;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

        // Test case 2
        System.out.println(solution.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}


class Solution{
    public double solution(int[] numbers){
        double sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum / numbers.length;
    }
}
