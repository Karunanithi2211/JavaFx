package com.nivak.Model;

import java.sql.ResultSet;
import java.time.LocalDate;

import com.nivak.View.AccountType;
import com.nivak.View.ViewFactory;

public class Model {

    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;

    private AccountType loginAccountType = AccountType.CLIENT;

    // Client Data Section
    private Client client;
    private boolean clientLoginSuccessFlag;
    // Admin Data Section

    private Model(){
        this.viewFactory = new ViewFactory();
        this.databaseDriver = new DatabaseDriver();

        // Client Data Section
        this.clientLoginSuccessFlag = false;
        this.client = new Client("", "", "", null, null, null);
        // Admin Data Section 
    }

    public static synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    /*
     * Client Methods Section
    */
    public boolean getClientLoginSuccessFlag(){return this.clientLoginSuccessFlag;}
    public void setClientLoginSuccessFlag(boolean clientLoginSuccessFlag){this.clientLoginSuccessFlag = clientLoginSuccessFlag;}

    public Client getClient() {
        return client;
    }

    public void evaluateClientCred(String pAddress, String password){
        CheckingAccount checkingAccount;
        SavingsAccount savingsAccount;
        ResultSet resultSet = databaseDriver.getClientData(pAddress,password);

        try {
            if(resultSet.isBeforeFirst()){
                this.client.firstNamProperty().set(resultSet.getString(("FirstName"))); 
                this.client.lastNameProperty().set(resultSet.getString(("LastName")));
                this.client.payeeAddressProperty().set(resultSet.getString(("PayeeAddress")));
                String[] dataParts = resultSet.getString("Date").split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(dataParts[0]), Integer.parseInt(dataParts[1]), Integer.parseInt(dataParts[2]));
                this.client.dateCreatedProperty().set(date);
                this.clientLoginSuccessFlag = true;
            }
        } catch (Exception e) {
            
        }
    }
}
