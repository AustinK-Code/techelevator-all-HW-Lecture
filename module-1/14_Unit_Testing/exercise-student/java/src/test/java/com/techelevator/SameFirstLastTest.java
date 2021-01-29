package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {
    @Test
    public void first_and_last_unequal_return_false(){
        SameFirstLast sut = new SameFirstLast();

        Assert.assertFalse(sut.isItTheSame(new int []{1,2,3}));
    }
    @Test
    public void first_and_last_equal_return_true(){
        SameFirstLast sut = new SameFirstLast();

        Assert.assertTrue(sut.isItTheSame(new int []{1,2,3,1}));
    }
    @Test
    public void first_and_last_equal_return_true_2(){
        SameFirstLast sut = new SameFirstLast();

        Assert.assertTrue(sut.isItTheSame(new int []{1,2,1}));
    }

}
