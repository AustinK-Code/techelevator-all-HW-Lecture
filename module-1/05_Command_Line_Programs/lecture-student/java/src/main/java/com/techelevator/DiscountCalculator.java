package com.techelevator;


import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the discount calculator!");

        boolean finished = false;
        while (finished == false) {
            //grab price
            System.out.print("Enter a list of prices separated by spaces. ");
            Scanner input = new Scanner(System.in);
            String prices = input.nextLine();
            String[] priceArray = prices.split(" ");

            //grab discount%
            System.out.print("What is the percent discount? ");
            String discount = input.nextLine();

            //calculate total price
            double total = 0;
            for (int i = 0; i < priceArray.length; i++) {
                double undiscountedPrice = Double.parseDouble(priceArray[i]);
                total += undiscountedPrice;
            }


            //calculate price total
            int discountPercent = Integer.parseInt(discount);
            double discountAmmount = total * (discountPercent / 100.0);
            double discountedTotal = total - discountAmmount;

            //print out discount price
            System.out.format("The discounted price is: $%.2f\n", discountedTotal);

            System.out.println("Are you finished? (y/n)");
            String response = input.nextLine();
            if (response.equals("y")) {
                finished = true;
            }
        }
        System.out.println("Thank you for using discount calculator.");


    }
}
