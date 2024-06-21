package com.ki.level0.pl120808;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("분수의 합은?")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(1, 2, 3, 4)).isEqualTo(new int[]{5, 4}); // 기대 값은 {5, 4}
    }

    @Test
    @DisplayName("분수의 합은?")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(9, 2, 1, 3)).isEqualTo(new int[]{29, 6}); // 기대 값은 {29, 6}
    }
}
