package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.sql.Array;
import java.util.Scanner;

public class SplitterUtil {
    String inputFile;
    int linesToSplit;
    int inputFileLineCount;
    int numOfOutputFiles;


    public int getNumOfOutputFiles() {
        return numOfOutputFiles;
    }


    public int getInputFileLineCount() {
        return inputFileLineCount;
    }

    public int getLinesToSplit() {
        return linesToSplit;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void setInputFileLineCount(int inputFileLineCount) {
        this.inputFileLineCount = inputFileLineCount;
    }

    public int setLinesToSplit(int linesToSplit) {
        this.linesToSplit = linesToSplit;
        return linesToSplit;
    }


    public void setNumOfOutputFiles(int numOfOutputFiles) {
        this.numOfOutputFiles = numOfOutputFiles;
    }


    public int calculateNumberOfLines() {
        Path filePath = Path.of(inputFile);
        try (Scanner scanner = new Scanner(filePath)) {
            inputFileLineCount = 0;
            while (scanner.hasNextLine()) {
                inputFileLineCount++;
                scanner.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Input file could not be accessed");
        }
        return inputFileLineCount;
    }


    public int calculateNumOfOutputFiles() {
        numOfOutputFiles = inputFileLineCount / linesToSplit + ((inputFileLineCount % linesToSplit == 0) ? 0 : 1);
        return numOfOutputFiles;
    }
    private String makeInputFileName(){
        return inputFile.substring(0,inputFile.indexOf("."));
    }


    public void generateOutput() {
        Path filePath = Path.of(inputFile);
        System.out.println("**GENERATING OUTPUT**");

        try (Scanner scanner = new Scanner(filePath)) {

            for (int i = 1; i <= numOfOutputFiles; i++) {
                //makes filename
                String filename = ( makeInputFileName() + "-" +i + ".txt");

                try (PrintWriter writer = new PrintWriter(filename)) {
                    for (int s = 1; s <= linesToSplit && scanner.hasNextLine(); s++) {
                        writer.println(scanner.nextLine());
                        System.out.println("Generating " + filename);

                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Could not make output file");
                }
            }
        } catch (IOException e) {
            System.out.println("Input file could not be accessed.");
        }
    }
}

