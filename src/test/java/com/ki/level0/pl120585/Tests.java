package com.ki.level0.pl120585;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("array1에서 167보다 큰 사람의 수")
    void test1() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
    }

    @Test
    @DisplayName("array2에서 190보다 큰 사람의 수")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{180, 120, 140}, 190)).isEqualTo(0);
    }

}
