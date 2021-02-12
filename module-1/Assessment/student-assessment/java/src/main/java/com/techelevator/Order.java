package com.techelevator;

import java.math.BigDecimal;

public class Order {
    private String bouquetType;
    private int numOfRoses;
    private BigDecimal subtotal = new BigDecimal("0.00");
    private BigDecimal total = new BigDecimal("0.00");

    public Order(String bouquetType, int numOfRoses){
        this.bouquetType = bouquetType;
        this.numOfRoses = numOfRoses;

    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public String getBouquetType() {
        return bouquetType;
    }

    public void setBouquetType(String bouquetType) {
        this.bouquetType = bouquetType;
    }

    public int getNumOfRoses() {
        return numOfRoses;
    }

    public void setNumOfRoses(int numOfRoses) {
        this.numOfRoses = numOfRoses;
    }
    public void calculatePrice(BigDecimal subtotal, String bouquetType, int numOfRoses){
        BigDecimal tempTotal = BigDecimal.valueOf(0);
        tempTotal = BigDecimal.valueOf(numOfRoses*2.99);
        if(bouquetType.equals("standard")) {
            tempTotal = tempTotal.add(BigDecimal.valueOf(19.99));
        }
        subtotal = tempTotal;
    }

    @Override
    public String toString() {
        return "ORDER - {" + bouquetType + "} - {" + numOfRoses +"} roses - {" + subtotal + "} ";
    }

    public BigDecimal delivery(Boolean sameDayDelivery, String zipcode){
        int zipcodeInt = Integer.parseInt(zipcode);
        BigDecimal cheapDelivery = new BigDecimal("3.99");
        BigDecimal expensiveDelivery = new BigDecimal("6.99");
        BigDecimal sameDayFee = new BigDecimal("5.99");
        if(zipcodeInt >= 10000 && zipcodeInt < 40000) {
            if (zipcodeInt >= 20000 && zipcodeInt <= 29999) {
                total = subtotal.add(cheapDelivery);
            } else if (zipcodeInt >= 30000) {
                total = subtotal.add(expensiveDelivery);
            } else {
                total = subtotal.add(BigDecimal.valueOf(0));
            }
            if (sameDayDelivery = true) {
                total = subtotal.add(sameDayFee);
            }
        }
        else {
            total = subtotal.add(BigDecimal.valueOf(19.99));
        }
        return total;
    }

}
