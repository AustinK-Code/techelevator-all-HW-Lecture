package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Words program = new Words();
        Scanner input = new Scanner(System.in);

        //Ask the questions and get the answers
        System.out.println("What is the search word?");
        program.setSearchWord(input.nextLine());
        System.out.println("What is the replacement word?");
        program.setReplacementWord(input.nextLine());
        System.out.println("What is the source file?");
        program.setSourceFile(input.nextLine());
        System.out.println("What is the destination file?");
        program.setDestinationFile(input.nextLine());

        Path source = Path.of(program.getSourceFile());

        try (Scanner sourceScanner = new Scanner(source)){
            try (PrintWriter destinationWriter = new PrintWriter(program.getDestinationFile())){
                while(sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();
                    String replaceLine = line.replace(program.getSearchWord(), program.getReplacementWord());
                    destinationWriter.println(replaceLine);
                }
            }catch (FileNotFoundException e){
                System.out.println("Output file could not be written to.");
            }
        } catch (IOException e) {
            System.out.println("Invalid input file error code: rabbit");
        }

    }

}
