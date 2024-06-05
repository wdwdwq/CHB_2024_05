package com.ki.level0.pl20240605;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("예각 테스트")
    void testAcute() {
        assertThat(new Solution().solution(45)).isEqualTo(1);
    }

    @Test
    @DisplayName("직각 테스트")
    void testRight() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("둔각 테스트")
    void testObtuse() {
        assertThat(new Solution().solution(135)).isEqualTo(3);
    }

    @Test
    @DisplayName("평각 테스트")
    void testStraight() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}
