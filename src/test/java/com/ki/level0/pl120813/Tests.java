package com.ki.level0.pl120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("짝수는 싫어요")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(9)).isEqualTo(new int[]{1, 3, 5, 7, 9});
    }

    @Test
    @DisplayName("짝수는 싫어요")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }
}
