package com.ki.level0.pl120810;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("나눈값은?:")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(3, 2)).isEqualTo(1);
    }

    @Test
    @DisplayName("나눈값은?:")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(10, 5)).isEqualTo(0);
    }
}
