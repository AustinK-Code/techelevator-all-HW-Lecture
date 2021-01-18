package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ans and grab entered numbers.
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine();

		//convert to in array
		String[] inputArray = userInput.split(" ");

		//create a for loop to convert and print.... profit$$$$$$$
		for (int i = 0 ; i < inputArray.length; i++){
			int binaryIntConvert = Integer.parseInt(inputArray[i]);
			System.out.println(inputArray[i] + " in binary is " + Integer.toBinaryString(binaryIntConvert));
		}


	}

}
