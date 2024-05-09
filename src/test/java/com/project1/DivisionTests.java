package com.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTests {
    @Test
    @DisplayName("6/2=3 test")
    public void testDivision1() {

        Division division = new Division();
        int result = division.divideTwoNumber(6, 2);

        Assertions.assertEquals(3, result);

    }


    @Test
    @DisplayName("8/1=8 test")
    public void testDivision2() {

        Division division = new Division();
        int result = division.divideTwoNumber(8, 1);

        Assertions.assertEquals(8, result);





    }
}
