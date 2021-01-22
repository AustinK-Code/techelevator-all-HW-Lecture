package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;


    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){//constructor
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }
    //methods
    public String getTypeOfFruit(){
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
    }


    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
        else{
            return false;
        }
    }


}
