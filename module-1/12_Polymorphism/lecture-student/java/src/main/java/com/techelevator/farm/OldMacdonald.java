package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow daisy = new Cow();
		Chicken nugger = new Chicken();
		Alpaca peru = new Alpaca();
		Tractor olRed = new Tractor();
		Singable[] singables = new Singable[]{ daisy,nugger,peru, new Tractor()};


		for (Singable singableThing : singables) {
			String name = singableThing.getName();
			String sound = singableThing.makeSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had " + singableThing.getArticle() + " " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();

		}

		Sellable [] merch = new Sellable[]{daisy,peru,nugger, new Egg()};
		BigDecimal total = BigDecimal.ZERO;
		for ( Sellable product : merch){
			System.out.println("And you can buy that " + product.getName() + " for only $" + product.getPrice());
			total = total.add(product.getPrice());
		}
		System.out.println("You can buy the whole farm for $" + total);

		List<String> mylist = new ArrayList<>();

		Singable eric = new Chicken();
		//be aware of but not best practices
		eric.makeSound();//make sound works for all singables
		((Chicken)eric).layEgg();//not recommended, only implemented by chickens
		Chicken clucker = (Chicken) eric;//not every singable is a chicken
		FarmAnimal critter = clucker;//every chicken is a Farmanimal

		if (eric instanceof Chicken){
			System.out.println("Eric is a chicken");
		}
		if (eric instanceof Singable){
			System.out.println("You can sing about Eric");
		}
		if ( eric instanceof Tractor){
			System.out.println("Eric is a tractor");
		}
	}
}