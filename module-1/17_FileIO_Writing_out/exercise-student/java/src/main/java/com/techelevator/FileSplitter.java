package com.techelevator;

import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		SplitterUtil utility = new SplitterUtil();
		Scanner input = new Scanner(System.in);


		System.out.println("Where is the input file (please include the path to the file)?");
		utility.setInputFile(input.nextLine());
		System.out.println("How many lines of text (max) should there be in the split files?");
		utility.setLinesToSplit(Integer.parseInt(input.nextLine()));
		System.out.println("The input file has " + utility.calculateNumberOfLines() + " lines of text.");
		System.out.println("For a " + utility.getLinesToSplit() + " line input file " + utility.getInputFile() + ", this produces " + utility.calculateNumOfOutputFiles());

		utility.generateOutput();
	}

}
