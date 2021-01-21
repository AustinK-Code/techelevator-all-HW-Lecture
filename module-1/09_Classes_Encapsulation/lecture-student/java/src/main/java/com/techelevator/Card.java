package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Card {

    private final  String suit;//makes it so it can be set once but that is it
    private final String rank;
    private boolean faceUp;

    public static String shape;

    public String getSuit() {//getters and setters.
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public boolean isFaceUp(){
        return faceUp;
    }
    public void setFaceUp(boolean faceUp){
        this.faceUp = faceUp;
    }
    public String getDescription(){// derived property, does not need to be called above
       String description = "Back of Card";
        if (faceUp){
            description = suit + " of " + rank;
        }
        return description;
    }
    public int getValue() {
        Map<String,Integer> cardValue = new HashMap<>();
        cardValue.put("Two", 2);
        cardValue.put("Three", 3);
        cardValue.put("Four", 4);
        cardValue.put("Five", 5);
        cardValue.put("Six", 6);
        cardValue.put("Seven", 7);
        cardValue.put("Eight", 8);
        cardValue.put("Nine", 9);
        cardValue.put("Ten", 10);
        cardValue.put("Jack", 11);
        cardValue.put("Queen", 12);
        cardValue.put("King", 13);
        cardValue.put("Ace", 14);

        return cardValue.get(rank);
    }

    public Card() {// constructor - method called in a new instance of that class
        suit = "Spades";
        rank = "Ace";
    }
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    public void flip() {
        faceUp = !faceUp;
    }
    public boolean isHigherThan(Card otherCard){
        return this.getValue() > otherCard.getValue();
    }
}
