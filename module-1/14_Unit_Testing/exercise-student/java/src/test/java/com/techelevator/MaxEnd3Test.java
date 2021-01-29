package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
    public void return_largest_end_333(){
        MaxEnd3 sut = new MaxEnd3();
        int[] goodResult = new int[]{3,3,3};
        int[] test = new int[]{1,2,3};

        int[] finalArray = sut.makeArray(test);

        Assert.assertArrayEquals(goodResult, finalArray);
    }
    @Test
    public void return_largest_first_111111(){
        MaxEnd3 sut = new MaxEnd3();
        int[] goodResult = new int[]{11,11,11};
        int[] test = new int[]{11,5,9};

        int[] finalArray = sut.makeArray(test);

        Assert.assertArrayEquals(goodResult, finalArray);
    }
    @Test
    public void return_largest_first_333(){
        MaxEnd3 sut = new MaxEnd3();
        int[] goodResult = new int[]{3,3,3};
        int[] test = new int[]{2,11,3};

        int[] finalArray = sut.makeArray(test);

        Assert.assertArrayEquals(goodResult, finalArray);
    }
}
