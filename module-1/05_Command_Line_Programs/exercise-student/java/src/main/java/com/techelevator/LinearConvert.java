package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//ask for distance number, grab it
		System.out.print(" Please enter the length: ");
		String lengthInput = input.nextLine();

		//ask for distance type, grab it
		System.out.println(" Is the measurement in (m)eters, or (f)eet?: ");
		String distanceTypeInput = input.nextLine();

		//make a boolean to make a switch and convert distance and type to doubles
		boolean metersIsTrue = distanceTypeInput.equals("m");
		double lengthInputDouble = Double.parseDouble(lengthInput);

		//declare variables for output
		double finalDistanceInFeet;
		double finalDistanceInMeters;

		//do the math and logic
		if (metersIsTrue){
			finalDistanceInFeet = lengthInputDouble * 3.2808399;
			//output starting distance and finishing distance
			System.out.println(lengthInputDouble + "m is " + finalDistanceInFeet + "f");
		}
		if (!metersIsTrue){
			finalDistanceInMeters = lengthInputDouble * 0.3048;
			//output starting distance and finishing distance
			System.out.println(lengthInputDouble + "f is " + finalDistanceInMeters + "m");
		}

	}

}
