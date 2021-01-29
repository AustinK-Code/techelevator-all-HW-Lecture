package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    @Test
    public void long_word_n_is_2_return_ChoCho(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("ChoCho",sut.generateString("Chocolate",2));
    }
    @Test
    public void long_word_n_is_3_return_ChoChoCho(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("ChoChoCho",sut.generateString("Chocolate",3));
    }
    @Test
    public void short_word_n_is_3_return_AbcAbcAbc(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("AbcAbcAbc",sut.generateString("Abc",3));
    }
}
