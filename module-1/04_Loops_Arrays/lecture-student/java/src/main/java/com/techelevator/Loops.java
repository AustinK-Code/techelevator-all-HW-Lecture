package com.techelevator;

public class Loops {

    public static void main(String[] args) {

        //Count up


        //Count down
       // for ( int i = 400 ; i < 1000 ;i = i + 2 ) {
           // System.out.println(i);



        //Add up numbers
        for ( int i = 1 ; i < 101 ; i = i + (i + 1)) {
            System.out.println(i);
        }


        //Add up only odd numbers
        int oddSum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if ( i % 2 == 1) {
                oddSum += 1;
            }
        }
        System.out.println(oddSum);
    }
}
