package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String destinationFile;

		System.out.println("What is the name of your destination file?");
		destinationFile = input.nextLine();

		try (PrintWriter writer = new PrintWriter(destinationFile)) {
			for (int i = 1; i <= 300 ; i++){
				String s = String.valueOf(i);
				if (i % 3 == 0 && i % 5 == 0){
					writer.println("FizzBuzz");
				}
				else if (i % 3 == 0 || s.contains("3")){
					writer.println("Fizz");
				}
				else if (i % 5 == 0 || s.contains("5")){
					writer.println("Buzz");
				}
				else writer.println(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid destination file.");
		}
	}

}
