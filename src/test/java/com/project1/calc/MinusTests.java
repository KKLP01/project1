package com.project1.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusTests {

    @Test
    @DisplayName("6과 3을 전달하면 3이 나오는지 확인")
    public void testMinusTowNumbers() {
        Minus minus = new Minus();
        int result = minus.minusTwoNumbers(6, 3);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("10과 4를 전달하면 6이 나오는지 확인")
    public void testMinusTowNumbers2() {
        Minus minus = new Minus();
        int result = minus.minusTwoNumbers(10, 4);

        Assertions.assertEquals(4, result);
    }
}
