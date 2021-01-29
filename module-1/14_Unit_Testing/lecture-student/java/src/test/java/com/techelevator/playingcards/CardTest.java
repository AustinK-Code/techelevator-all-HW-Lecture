package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void no_args_constructor_makes_ace_of_spades() {
        //Arrange & Act
        Card sut = new Card();

        //Assert
        Assert.assertEquals("Ace",sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
   }

   @Test
    public void constructor_makes_specified_card(){
        Card sut = new Card("Jack", Suit.DIAMONDS);

        Assert.assertEquals("Jack", sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS,sut.getSuit());
   }
   @Test
    public void getDescription_returns_back_of_card_when_face_down(){
        //Arrange
       Card sut = new Card();
       sut.setFaceUp(false);

       //Act
       String description = sut.getDescription();

       //Assert
       Assert.assertEquals("Back of Card", description);
   }
    @Test
    public void getDescription_returns_rank_of_suit_when_face_up(){
        //Arrange
        Card sut = new Card();
        sut.setFaceUp(true);

        //Act
        String description = sut.getDescription();

        //Assert
        Assert.assertEquals("Ace of Spades", description);
    }
    @Test
    public void getValueForRank_returns_card(){
        Card sut = new Card();

        int rankVal = sut.getValueForRank(sut.getRank());

        Assert.assertEquals(14,rankVal);
    }
    @Test
    public void flip_changes_face_up_to_face_down(){
        Card sut = new Card();
        sut.setFaceUp(true);

        sut.flip();

        Assert.assertFalse(sut.isFaceUp());
    }
    @Test
    public void is_higher_than_returns_true(){
        Card sut = new Card();
        Card sut2 = new Card("King", Suit.DIAMONDS);

        Assert.assertTrue(sut.isHigherThan(sut2));

    }
    @Test
    public void GetHalfValue_returns_two_and_a_half(){
        Card sur = new Card("Five", Suit.CLUBS);

        do
    }

}