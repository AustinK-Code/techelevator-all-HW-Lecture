package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
    @Test
    public void contains_no_1s_and_3s_return_true(){
        Lucky13 sut = new Lucky13();

        int[] test = new int[]{0,2,4};
        boolean isTrue = sut.getLucky(test);

        Assert.assertTrue(isTrue);
    }
    @Test
    public void contains_one_one_return_false(){
        Lucky13 sut = new Lucky13();

        int[] test = new int[]{1,2,3};
        boolean isTrue = sut.getLucky(test);

        Assert.assertFalse(isTrue);
    }
    @Test
    public void contains_one_one_no_three_return_false(){
        Lucky13 sut = new Lucky13();

        int[] test = new int[]{1,2,4};
        boolean isTrue = sut.getLucky(test);

        Assert.assertFalse(isTrue);
    }
}
