package com.ki.level0.pl120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("배열 [1, 2, 7, 10, 11]의 중앙값")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
    }

    @Test
    @DisplayName("배열 [1, 2, 7, 10, 11]의 중앙값")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
    }

}
