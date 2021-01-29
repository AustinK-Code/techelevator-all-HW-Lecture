package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {
    @Test
    public void one_is_stylish_return_yes(){
        DateFashion sut = new DateFashion();

        int shouldBe2 = sut.getATable(5,10);

        Assert.assertEquals(2, shouldBe2);
    }
    @Test
    public void neither_is_stylish_return_zero(){
        DateFashion sut = new DateFashion();

        Assert.assertEquals(0, sut.getATable(5,2));
    }
    @Test
    public void neither_is_stylish_but_beither_is_ugly_return_one(){
        DateFashion sut = new DateFashion();

        Assert.assertEquals(1, sut.getATable(5,5));
    }
}
