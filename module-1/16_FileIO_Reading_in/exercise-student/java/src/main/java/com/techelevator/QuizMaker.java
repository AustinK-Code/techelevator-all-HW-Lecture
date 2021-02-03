package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fully qualified name of the file to read in for the quiz.");
		String filename = input.nextLine();
		Path myPath = Path.of(filename);
		QuizQuestion question1 = new QuizQuestion();
		int correctAnswerCount=0;
		int timesThroughScannerLoop = 0;
		try(Scanner scan = new Scanner(myPath)){
			while (scan.hasNextLine()){
				String line = scan.nextLine();
					String[] linearray = line.split("\\|");
					for(int i = 1; i < linearray.length; i++){
						if(linearray[i].contains("*")){
							linearray[i] = linearray[i].replace("*"," ");
							question1.setCorrectAnswer(i);
						}
					}
					question1.setQuestion(linearray[0]);
					question1.setAnswer1(linearray[1]);
					question1.setAnswer2(linearray[2]);
					question1.setAnswer3(linearray[3]);
					question1.setAnswer4(linearray[4]);
					System.out.println(question1.getQuestion());
					System.out.println("1. " + question1.getAnswer1());
					System.out.println("2. " + question1.getAnswer2());
					System.out.println("3. " + question1.getAnswer3());
					System.out.println("4. " + question1.getAnswer4());
					System.out.println("\nYour answer: ");
					String userAnswer = input.nextLine();
					int userInt = Integer.parseInt(userAnswer);
					if(userInt==question1.getCorrectAnswer()){
						System.out.println("RIGHT!\n ");
						correctAnswerCount++;
					}else{
						System.out.println("WRONG!\n");
					}
					timesThroughScannerLoop++;
				}
			} catch (IOException e) {
			System.out.println("Failure try again");
		}
		System.out.println("You got " + correctAnswerCount + " answer(s) correct out of " + timesThroughScannerLoop + " questions asked.");

	}

}
