package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    @Test
    public void Dictionary_Return_Ba2_Black1_Sheep1(){
        WordCount sut = new WordCount();
        Map<String, Integer> output =
                Map.of("ba",2,"black",1,"sheep",1);
        String [] input = new String[]{"ba","ba","black","sheep"};

        Assert.assertEquals(output, sut.getCount(input));
    }
    @Test
    public void Dictionary_Return_a2_b2_c1(){
        WordCount sut = new WordCount();
        Map<String, Integer> output =
                Map.of("a",2,"b",2,"c",1);
        String [] input = new String[]{"a", "b", "a", "c", "b"};

        Assert.assertEquals(output, sut.getCount(input));
    }
    @Test
    public void Dictionary_Return_Blank(){
        WordCount sut = new WordCount();
        Map<String, Integer> output =
                new HashMap<>();
        String [] input = new String[]{};
        Assert.assertEquals(output, sut.getCount(input));
    }
    @Test
    public void Dictionary_Return_c1_b1_a1(){
        WordCount sut = new WordCount();
        Map<String, Integer> output =
                Map.of("c",1,"b",1,"a",1);
        String [] input = new String[]{"c", "b", "a"};

        Assert.assertEquals(output, sut.getCount(input));
    }

}
