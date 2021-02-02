package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class QuizFeature {

    String file;
    List<String> questionList;
    List<String> answerList;

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setQuestionList(List<String> questionList) {
        this.questionList = questionList;
    }

    public void initialize(){
        System.out.println("Enter the fully qualified name of the " +
                "file to read in for the quiz questions");
        Scanner input = new Scanner(System.in);
        file = input.nextLine();
    }
    public void grabInputs(){
        Path path = Path.of(file);

        try (Scanner fileScanner = new Scanner(path)){
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                questionList.add(line.substring(0,line.indexOf("|")));
                answerList.add(line.substring(line.indexOf("|")));
            }
        } catch (IOException e) {
            System.out.println("Failure");
        }
    }
}
