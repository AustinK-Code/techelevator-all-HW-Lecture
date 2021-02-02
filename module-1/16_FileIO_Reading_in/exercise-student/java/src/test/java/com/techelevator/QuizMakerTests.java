package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuizMakerTests {
    @Test
    public void GrabInputsTest(){
        QuizFeature sut = new QuizFeature();
        ArrayList<String> test = new ArrayList<String>();
        ArrayList<String> test2 = new ArrayList<String>();
        test.add("A");
        test.add("B");
        test.add("C");
        test2.add("1");
        test2.add("2");
        test2.add("3");
        sut.setAnswerList(test);
        sut.setQuestionList(test2);


      //  Assert.assertEquals();
    }
}
