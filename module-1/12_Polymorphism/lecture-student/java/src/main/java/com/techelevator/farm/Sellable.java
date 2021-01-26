package com.techelevator.farm;

import java.math.BigDecimal;

public interface Sellable {//looking for methods needed for the contract
    BigDecimal getPrice();
    String getName();
}
