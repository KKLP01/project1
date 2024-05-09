package com.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiTests {


    @Test
    public void testMulti() {

        Multi multi = new Multi();
        int result = multi.multiNumbers(10, 55);

        Assertions.assertEquals(560, result);
    }


}

