package com.ki.level0.pl120910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("세균의 수는? : 2, 10")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(2, 10)).isEqualTo(2048);
    }

    @Test
    @DisplayName("세균의 수는? : 7, 15")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(7, 15)).isEqualTo(229376);
    }
}
