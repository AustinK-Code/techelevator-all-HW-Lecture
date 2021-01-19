package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        int num = 5;
        Integer number = 5;
        String s = number.toString(); //s will be a string "5"

        num = number;

        List<Integer> mylist;
        mylist = new ArrayList<Integer>();

        mylist.add(5);
        mylist.add(4);
        mylist.add(10);
        mylist.add(99);

        for(int i = 0 ; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        for ( int value : mylist){// repeats for each value in the list.
            System.out.println(value);
        }
    }
}
