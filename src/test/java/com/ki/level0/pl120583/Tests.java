package com.ki.level0.pl120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
@Test
@DisplayName("array에 1이 몇 번 들어 있는지 테스트")
void test1() {
    Solution solution = new Solution();
    assertThat(solution.solution(new int[]{1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
}

    @Test
    @DisplayName("array에 1이 몇 번 들어 있는지 테스트")
    void test2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);
    }

}
