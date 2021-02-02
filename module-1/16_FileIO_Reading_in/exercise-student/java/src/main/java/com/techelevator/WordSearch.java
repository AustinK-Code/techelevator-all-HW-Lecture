package com.techelevator;

public class WordSearch {

    public static void main(String[] args) {
        Features program = new Features();
        program.enterQuestions();
        if (program.getIsCaseSensitive().equals("Y")) {
            program.scanDocCaseSensitive();
        } else {
            program.scanDocNotCaseSensitive();
        }

    }
}
