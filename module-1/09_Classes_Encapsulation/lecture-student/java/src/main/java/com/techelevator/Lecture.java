package com.techelevator;


public class Lecture {

    public static void main(String[] args) {

        Card firstCard = new Card();
        Card secondCard = new Card();

        System.out.println(firstCard);//prints reference


        System.out.println(firstCard.getSuit());
        System.out.println(secondCard.getSuit());

        System.out.println(secondCard.getRank());
        System.out.println(secondCard.isFaceUp());

        System.out.println(secondCard.getDescription());
        System.out.println(firstCard.getDescription());
        secondCard.setFaceUp(true);
        System.out.println(secondCard.getValue());

        Card thirdCard = new Card("Queen","Hearts");
        System.out.println(thirdCard.getDescription());
        System.out.println(thirdCard.getValue());
        thirdCard.flip();

        if (thirdCard.isHigherThan(secondCard)){
            System.out.println("Third card is higher");
        } else {
            System.out.println("Second card is higher");
        }


        Deck myDeck = new Deck();
        Card firstPick = myDeck.drawCard();
        firstPick.flip();
        System.out.println(firstPick.getDescription());

        myDeck.shuffle();
        while (myDeck.getCardCount() > 0 ){
            Card pick = myDeck.drawCard();
            pick.flip();
            System.out.println(pick.getDescription());
        }


    }
}
