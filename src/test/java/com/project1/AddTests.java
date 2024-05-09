package com.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTests {
    @Test
    public void testAdd() {
        Add add = new Add();
        int result = add.addTwoNumbers(1, 2);
        Assertions.assertEquals(result, 3);
    }
}