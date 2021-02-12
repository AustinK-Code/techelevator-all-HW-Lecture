package com.techelevator;

import java.math.BigDecimal;

public class Module1CodingAssessment {


	public static void main(String[] args) {
		Order dozen = new Order("dozen", 12);
		// TODO Auto-generated method stub
		System.out.println(dozen.getBouquetType());
		System.out.println(dozen.getNumOfRoses());
		System.out.println(dozen.getSubtotal());
		dozen.setBouquetType("HalfDozen");
		dozen.setNumOfRoses(6);
		dozen.setSubtotal(BigDecimal.valueOf(10.00));
		System.out.println(dozen.getBouquetType());
		System.out.println(dozen.getNumOfRoses());
		System.out.println(dozen.getSubtotal());
		dozen.delivery(true,"33333");
		System.out.println(dozen.getSubtotal());

	}

}
