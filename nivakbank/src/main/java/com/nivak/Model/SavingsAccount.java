package com.nivak.Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount extends Account {

    private final DoubleProperty withdrawLimit;

    public SavingsAccount(String owner, String accountNumber, Double balance, Double withdrawLimit) {
        super(owner, accountNumber, balance);
        this.withdrawLimit = new SimpleDoubleProperty(this, "WithdrawLimit", withdrawLimit);
    }

    public DoubleProperty withdrawLimitProperty() {return withdrawLimit;}

}
