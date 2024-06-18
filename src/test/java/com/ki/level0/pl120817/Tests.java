package com.ki.level0.pl120817;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("평균값은?:")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);
    }

    @Test
    @DisplayName("평균값은?:")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);
    }
}
