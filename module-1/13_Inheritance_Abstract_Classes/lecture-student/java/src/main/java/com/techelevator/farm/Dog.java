package com.techelevator.farm;

public class Dog extends FarmAnimal{

    public Dog(){
        super("Dog");
    }


    @Override
    public String makeSound() {
        return "woof woof";
    }
}
