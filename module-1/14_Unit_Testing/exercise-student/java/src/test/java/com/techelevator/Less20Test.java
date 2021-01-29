package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    @Test
    public void is_less_than_a_multiple_of_20_Return_True(){
        Less20 sut = new Less20();

        Assert.assertTrue(sut.isLessThanMultipleOf20(18));
    }
    @Test
    public void is_less_than_a_multiple_of_20_2_return_True(){
        Less20 sut = new Less20();

        Assert.assertTrue(sut.isLessThanMultipleOf20(19));
    }
    @Test
    public void is_multiple_of_20_return_false(){
        Less20 sut = new Less20();

        Assert.assertFalse(sut.isLessThanMultipleOf20(20));
    }
}
