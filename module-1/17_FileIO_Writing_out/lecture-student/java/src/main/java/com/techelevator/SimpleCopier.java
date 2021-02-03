package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class SimpleCopier {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a file name to copy");
        String sourceFileName = userInput.nextLine();

        System.out.println("Please enter a new name to copy to.");
        String destinationFileName = userInput.nextLine();

        Path source = Path.of(sourceFileName);

        try (Scanner sourceScanner = new Scanner(source)){
            try (PrintWriter writer = new PrintWriter(destinationFileName)){
                while(sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();
                    writer.println(line);
                }
            }catch (FileNotFoundException e){
                System.out.println("Output file could not be written to.");
            }
        } catch (IOException e) {
            System.out.println("Invalid input file error code: rabbit");
        }

    }
}
