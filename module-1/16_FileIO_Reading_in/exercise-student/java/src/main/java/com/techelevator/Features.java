package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Features {

    private String nameOfFile;
    private String requestedSearchWord;
    private String isCaseSensitive;

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public void setRequestedSearchWord(String requestedSearchWord) {
        this.requestedSearchWord = requestedSearchWord;
    }

    public void setIsCaseSensitive(String isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    public void enterQuestions() {
        System.out.println("What is the fully " +
                "qualified name of the file that should be searched?");
        Scanner input = new Scanner(System.in);
        this.nameOfFile = input.nextLine();
        System.out.println("What is the search word you are looking for?");
        this.requestedSearchWord = input.nextLine();
        System.out.println("Should the search be case sensitive? (Y\\N)");
        this.isCaseSensitive = input.nextLine();
    }

    public String getIsCaseSensitive() {
        return isCaseSensitive;
    }

    public String scanDocCaseSensitive() {
        Path path = Path.of(nameOfFile);
        int counter = 0;
        try (Scanner fileScanner = new Scanner(path)) {
            while (fileScanner.hasNextLine()) {
                counter ++;
                String line = fileScanner.nextLine();
                if (line.contains(requestedSearchWord)){
                    System.out.println(counter + ") " + requestedSearchWord + ", "
                    + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not search file");
            return "Could not search file";
        }
        return null;
    }

    public String scanDocNotCaseSensitive() {
        Path path = Path.of(nameOfFile);
        int counter = 0;
        try (Scanner fileScanner = new Scanner(path)) {
            while (fileScanner.hasNextLine()) {
                counter ++;
                String line = fileScanner.nextLine();
                if (line.toUpperCase().contains(requestedSearchWord.toUpperCase())){
                    System.out.println(counter + ") " + requestedSearchWord + ", "
                            + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not search file");
            return "Could not search file";
        }
        return null;
    }
}
