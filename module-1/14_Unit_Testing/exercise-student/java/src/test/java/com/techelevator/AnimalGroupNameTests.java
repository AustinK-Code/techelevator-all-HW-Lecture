package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {
    @Test
    public void getHerd_returns_Tower_for_giraffe() {
//Arrange
        AnimalGroupName sut = new AnimalGroupName();
//Act
        String herd = sut.getHerd("giraffe");
//Assert
        Assert.assertEquals("Tower", herd);
    }

    @Test
    public void getHerd_returns_unknown_for_blank() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("");
        //Assert
        Assert.assertEquals("unknown", herd);

    }

    @Test
    public void getHerd_returns_unknown_for_walrus() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("walrus");
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returns_unknown_for_elephants() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("elephants");
        //Assert
        Assert.assertEquals("unknown", herd);
    }

    @Test
    public void getHerd_returns_crash_for_Rhino_capital_first_letter() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("Rhino");
        //Assert
        Assert.assertEquals("Crash", herd);
    }

    @Test
    public void getHerd_returns_crash_for_rhino() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("rhino");
        //Assert
        Assert.assertEquals("Crash", herd);
    }
}