package com.nivak;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calculator implements Initializable {
    @FXML
    private Button clear;

    @FXML
    private TextField display;

    @FXML
    private Button divide;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button no0;

    @FXML
    private Button no1;

    @FXML
    private Button no2;

    @FXML
    private Button no3;

    @FXML
    private Button no4;

    @FXML
    private Button no5;

    @FXML
    private Button no6;

    @FXML
    private Button no7;

    @FXML
    private Button no8;

    @FXML
    private Button no9;

    @FXML
    private Button plus;

    @FXML
    private Button plusminus;

    private String operations = "";
    private String newInt = "";
    private String displayString = "";
    ArrayList<Integer> numbers = new ArrayList<>();

    @FXML
    void no1Btn(ActionEvent event) {
        displayString += "1";
        newInt+="1";
        display.setText(displayString);
    }
    @FXML
    void no2Btn(ActionEvent event) {
        displayString += "2";
        newInt+="2";
        display.setText(displayString);
    }
    @FXML
    void no3Btn(ActionEvent event) {
        displayString += "3";
        newInt+="3";
        display.setText(displayString);
    }
    @FXML
    void no4Btn(ActionEvent event) {
        displayString += "4";
        newInt+="4";
        display.setText(displayString);
    }
    @FXML
    void no5Btn(ActionEvent event) {
        displayString += "5";
        newInt+="5";
        display.setText(displayString);
    }
    @FXML
    void no6Btn(ActionEvent event) {
        displayString += "6";
        newInt+="6";
        display.setText(displayString);
    }
    @FXML
    void no7Btn(ActionEvent event) {
        displayString += "7";
        newInt+="7";
        display.setText(displayString);
    }
    @FXML
    void no8Btn(ActionEvent event) {
        displayString += "8";
        newInt+="8";
        display.setText(displayString);
    }
    @FXML
    void no9Btn(ActionEvent event) {
        displayString += "9";
        newInt+="9";
        display.setText(displayString);
    }
    @FXML
    void no0Btn(ActionEvent event) {
        displayString += "0";
        newInt+="0";
        display.setText(displayString);
    }

    @FXML
    void dotBtn(ActionEvent event) {
        displayString += ".";
        newInt+=".";
        display.setText(displayString);
    }

    @FXML
    void plusBtn(ActionEvent event) {
        displayString += "+";
        operations += "+";
        numbers.add(Integer.parseInt(newInt));
        newInt = "";
        display.setText(displayString);
    }

    @FXML
    void divideBtn(ActionEvent event) {
        displayString = "/";
        operations += "/";
        numbers.add(Integer.parseInt(newInt));
        newInt = "";
        display.setText(displayString);
    }

    @FXML
    void minusBtn(ActionEvent event) {
        displayString += "-";
        operations += "-";
        numbers.add(Integer.parseInt(newInt));
        newInt = "";
        display.setText(displayString);
    }

    @FXML
    void mulBtn(ActionEvent event) {
        displayString += "*";
        operations += "*";
        numbers.add(Integer.parseInt(newInt));
        newInt = "";
        display.setText(displayString);
    }

    @FXML
    void clearBtn(ActionEvent event) {
        displayString = "";
        numbers.clear();
        operations = "";
        newInt = "";
        display.setText(displayString);
    }

    @FXML
    void delete(ActionEvent event) {
        if (newInt.length() != 0) {
            newInt = newInt.substring(0, newInt.length() - 1);
        }
        else{
            operations = operations.substring(0, operations.length() - 1);
        }
        displayString = displayString.substring(0, displayString.length() - 1);
        display.setText(displayString);
    }

    @FXML// 20+40
    void equalBtn(ActionEvent event) {
        if(newInt.length() != 0)numbers.add(Integer.parseInt(newInt));

        double result = 0;
        int index = 2;

        if(operations.length() == 0 || operations.length() == numbers.size())
            return;

        // intialize
        if(operations.charAt(0) == '+'){
            result = numbers.get(0) + numbers.get(1);
        }
        if(operations.charAt(0) == '-'){
            result = numbers.get(0) - numbers.get(1);
        }
        if(operations.charAt(0) == '/'){
            result = numbers.get(0) / numbers.get(1);
        }
        if(operations.charAt(0) == '*'){
            result = numbers.get(0) * numbers.get(1);
        }

        //otherOperations
        for (int i = 1; i < operations.length(); i++) {
            if(operations.charAt(i) == '+'){
                result += numbers.get(index++);
            }
            if(operations.charAt(0) == '-'){
                result -= numbers.get(index++);
            }
            if(operations.charAt(0) == '/'){
                result /= numbers.get(index++);
            }
            if(operations.charAt(0) == '*'){
                result *= numbers.get(index++);
            }
        }
        
        display.setText(Integer.toString((int) result));
        displayString = "";
        numbers.clear();
        operations = "";
        newInt = "";
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }
    
}
