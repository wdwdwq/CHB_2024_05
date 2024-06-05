package com.ki.level0.pl120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
//장군 5
//병정 3
//일개미 1
    @Test
    @DisplayName("사냥감 체력 23일 때 5")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("사냥감 체력 24일 때 6")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    @DisplayName("사냥감 체력 999일 때 201")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }




}
