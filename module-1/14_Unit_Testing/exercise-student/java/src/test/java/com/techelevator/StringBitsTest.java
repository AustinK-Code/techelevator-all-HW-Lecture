package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
    @Test
    public void Every_Other_Return_Hlo(){
        StringBits sut = new StringBits();

        Assert.assertEquals("Hlo", sut.getBits("Hello"));
    }
    @Test
    public void Every_Other_Return_H(){
        StringBits sut = new StringBits();

        Assert.assertEquals("H", sut.getBits("Hi"));
    }
    @Test
    public void Every_Other_Return_Hello(){
        StringBits sut = new StringBits();

        Assert.assertEquals("Hello", sut.getBits("Heeololeo"));
    }
}
