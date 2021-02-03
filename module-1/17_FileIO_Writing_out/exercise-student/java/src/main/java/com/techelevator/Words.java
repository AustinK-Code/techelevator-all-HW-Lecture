package com.techelevator;

public class Words {
    private String searchWord;
    private String replacementWord;
    private String sourceFile;
    private String destinationFile;

    public String getDestinationFile() {
        return destinationFile;
    }

    public String getReplacementWord() {
        return replacementWord;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setDestinationFile(String destinationFile) {
        this.destinationFile = destinationFile;
    }

    public void setReplacementWord(String replacementWord) {
        this.replacementWord = replacementWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

}
