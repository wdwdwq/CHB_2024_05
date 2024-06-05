package com.ki.level0.pl20240605;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 1, 1, 1, 1, 2};
        int[] numbers3 = {1, 0, 1, 1, 1, 3, 5};

        Solution solution = new Solution();
        int [] result1 = solution.solution(numbers1);
        int [] result2 = solution.solution(numbers2);
        int [] result3 = solution.solution(numbers3);

        System.out.println("numbers1의 뒤집은 배열: " + Arrays.toString(result1));
        System.out.println("numbers2의 뒤집은 배열: " + Arrays.toString(result2));
        System.out.println("numbers3의 뒤집은 배열: " + Arrays.toString(result3));
    }
}


class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length; // 입력한 배열의 길이를 구한다
        int[] answer = new int[length]; // 동일한 길이의 새로운 배열을 생성

        // 입력 배열의 요소를 뒤집어 새로운 배열에 저장
        for(int i = 0; i < length; i++){
            answer[i] = num_list[length - 1 - i]; // 마지막 요소부터 차례로
        }

        return answer; // 뒤집어진 배열을 반환함
    }
}


