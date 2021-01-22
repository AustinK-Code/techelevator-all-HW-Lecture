package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int totalCoachSeats;
    private int bookedFirstClassSeats;
    private int bookedCoachSeats;


    //constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }
    public String getPlaneNumber(){
        return planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }

    public  int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }
    //derived work on this
    public int getAvailableFirstClassSeats(){

        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getTotalCoachSeats(){
        return totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }
    //derived
    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats;
    }
    //methods
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        boolean canIBookSeats = false;
        if (forFirstClass && totalNumberOfSeats + bookedFirstClassSeats <= getAvailableFirstClassSeats()){
            bookedFirstClassSeats = totalNumberOfSeats + bookedFirstClassSeats;
            canIBookSeats = true;
        }
        if (!forFirstClass && totalNumberOfSeats + bookedCoachSeats <= getAvailableCoachSeats()){
            bookedCoachSeats = totalNumberOfSeats + bookedCoachSeats;
            canIBookSeats = true;
        }
        return canIBookSeats;

    }



}
