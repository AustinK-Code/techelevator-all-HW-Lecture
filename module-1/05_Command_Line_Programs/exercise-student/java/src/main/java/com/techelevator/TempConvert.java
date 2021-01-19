package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//please enter the temperature
		System.out.println("please enter the temperature ");
		String inputTemp = input.nextLine();

		//Ask if temp is celsius or fahrenheit
		System.out.println("Is the temp (C)elsius or (F)ahrenheit? ");
		String inputTempType = input.nextLine();
		String startingTempAndType = inputTemp + inputTempType;
		System.out.println("Your requested temperature is: " + startingTempAndType);

		//Convert to int and bool
		boolean cTrue = inputTempType.equals("C");
		double inputTempInt = Double.parseDouble(inputTemp);

		//math it
		double tempCelsius;
		double tempFahrenheit;
		if (!cTrue){
			tempCelsius = (inputTempInt - 32) / 1.8;
			System.out.format("%.2f is %.2C\n",startingTempAndType ,tempCelsius);
		}
		 if (cTrue){
			tempFahrenheit = (inputTempInt * 1.8 + 32);
			System.out.format("%.2f is %.2F\n", startingTempAndType , tempFahrenheit);
		}








	}

}
