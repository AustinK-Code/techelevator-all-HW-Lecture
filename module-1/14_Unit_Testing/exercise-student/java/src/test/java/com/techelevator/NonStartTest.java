package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
    @Test
    public void concationate_return_ellohere(){
        NonStart sut = new NonStart();

        Assert.assertEquals("ellohere",sut.getPartialString("Hello","There"));
    }
    @Test
    public void concationate_return_avaode(){
        NonStart sut = new NonStart();

        Assert.assertEquals("avaode",sut.getPartialString("java","code"));
    }
    @Test
    public void concationate_return_hotlava(){
        NonStart sut = new NonStart();

        Assert.assertEquals("hotlava",sut.getPartialString("shotl","java"));
    }
    @Test
    public void concationate_two_letter_a_words(){
        NonStart sut = new NonStart();

        Assert.assertEquals("",sut.getPartialString("a",""));
    }
    @Test
    public void concationate_two_letter_b_words(){
        NonStart sut = new NonStart();

        Assert.assertEquals("",sut.getPartialString("","a"));
    }
}
