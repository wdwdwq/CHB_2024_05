package com.ki.level0.pl120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("짝수의 합은?")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(4)).isEqualTo(6);  // 2 + 4 = 6
    }

    @Test
    @DisplayName("짝수의 합은?")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(10)).isEqualTo(30);  // 2 + 4 + 6 + 8 + 10 = 30
    }
}
