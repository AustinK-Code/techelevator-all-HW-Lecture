package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt for input and grab it
		System.out.println("Please enter the Fibonacci number :");
		String userInputString = input.nextLine();

		//convert to int
		int userInput = Integer.parseInt(userInputString);

		//make some arrays
		int [] fibonacciArray = new int[userInput + 2];
		fibonacciArray[0]=0;
		fibonacciArray[1]=1;

		if(userInput==0){
			System.out.println(0);
			return;
		}
		else if(userInput==1) {
			System.out.println(0 + ", " + 1);
			return;
		}

		for (int i = 2; i <= userInput ; i++) {
			if (i >= 2) {
				fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
			}
		}
		System.out.print("0, ");
		for (int i = 1; i <= userInput ; i++) {
			if (fibonacciArray[i] > 0 && fibonacciArray[i] <= userInput){
				System.out.print(fibonacciArray[i] + ", ");
			}

		}

	}

}
