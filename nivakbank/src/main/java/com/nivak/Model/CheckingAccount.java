package com.nivak.Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account {
    private final IntegerProperty transactionLimit;

    public CheckingAccount(String owner, String accountNumber, Double balance, int transactionLimit) {
        super(owner, accountNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "TransactionLimit",transactionLimit);
    }

    public IntegerProperty trasactionLimitProperty() { return transactionLimit;}

    
    
}
