package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

public class HandTest {

    @Test
    public void Add_Card_Adds_Card_To_Hand(){
        Hand sut = new Hand();
        Card card = new Card();

        sut.addCard(card);
        int endingCount = sut.getNumberOfCards();

        Assert.assertEquals(1,endingCount);
    }
    @Test
    public void Get_Number_Of_Cards_Returns_Correct_Count(){
        Hand sut = new Hand();
        Card card1 = new Card();
        Card cards2 = new Card();
        sut.addCard(card1);
        sut.addCard(cards2);

        Assert.assertEquals(2,sut.getNumberOfCards());
    }




}
