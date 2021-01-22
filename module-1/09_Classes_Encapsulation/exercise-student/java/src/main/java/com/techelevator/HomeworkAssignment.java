package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMark, String submitterName){
        this.possibleMarks = possibleMark;
        this.submitterName = submitterName;
    }
    public int getEarnedMarks(){
        return earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }
    public int getPossibleMarks(){
        return possibleMarks;
    }
    public String getSubmitterName(){
        return submitterName;
    }
    public String getLetterGrade(){  //derived
        String letterGrade = "F";
        double markPercentage = ((earnedMarks * 100) / possibleMarks);
        if (markPercentage >= 90){
            letterGrade = "A";
        }
        if (markPercentage >= 80 && markPercentage <90){
            letterGrade = "B";
        }
        if (markPercentage >=70 && markPercentage <80){
            letterGrade = "C";
        }
        if (markPercentage >= 60 && markPercentage < 70){
            letterGrade = "D";
        }
        return letterGrade;
    }
}
