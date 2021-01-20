package com.techelevator;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(10);
        numbers.add(4096);
        numbers.add(10);
        System.out.println(numbers);

        for ( int number : numbers){
            System.out.println(number);
        }

        Set<Integer> moreNUmbers = new LinkedHashSet<>();
        moreNUmbers.add(12);
        moreNUmbers.add(10);
        moreNUmbers.add(4096);
        moreNUmbers.add(10);
        moreNUmbers.add(100);
        System.out.println(moreNUmbers);

        for (int number : moreNUmbers){
            System.out.println(number);
        }

        Map<String,String> studentClass = new HashMap<>();
        studentClass.put("Megan", "Java");
        studentClass.put("Garrett", "Java");
        studentClass.put("Wes",".NET");

        System.out.println(studentClass);
    }
}
