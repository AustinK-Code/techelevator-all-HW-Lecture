package com.techelevator.readfiles;

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTest {

    @Test
    public void countWordsINLineHandlesTheObvious() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this is a test");

        Assert.assertEquals(4, count);
    }
    @Test
    public void countWordsINLineHandlesEmptyString() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("");

        Assert.assertEquals(0, count);
    }
    @Test
    public void countWordsINLineHandlesSpaceAtBegginingAndEnd() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("    This is a test    ");

        Assert.assertEquals(4, count);
    }
    @Test
    public void countWordsINLineHandlesMultipleSpaces() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine(" This    is   a   test    ");

        Assert.assertEquals(4, count);
    }
}
