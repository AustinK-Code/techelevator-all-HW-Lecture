package com.techelevator;

public class Elevator {

    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen = false;



    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isDoorOpen() {
        return doorOpen;
    }

    //constructor
    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
    }



    //methods
    public void openDoor(){
        doorOpen = true;
    }
    public void closeDoor(){
        doorOpen = false;
    }
    public void goUp(int desiredFloor){

        if (!doorOpen && (desiredFloor <= numberOfFloors) && (desiredFloor >= 0) && (desiredFloor > currentFloor)){
            this.currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor){

        if (!doorOpen && (desiredFloor >= 0) && (desiredFloor <= numberOfFloors) && (desiredFloor < currentFloor)){
            this.currentFloor = desiredFloor;
        }
    }

}
