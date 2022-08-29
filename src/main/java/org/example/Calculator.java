package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    int num2;

    int o = 0;

    String operator;

    UserInput userInput = new UserInput();

    public void runCalculator(){
        boolean isActive = true;
        userInput.printMessage("Enter a number");
        o = userInput.getNumber();
        while (isActive) {
            userInput.printMessage("Enter a number");
            num2 = userInput.getNumber();
            userInput.printMessage("Enter operator(+*/-=)");
            operator = userInput.getOperator();
            calculate(o, num2);
            userInput.printMessage("continue [y/n]");
            String input = userInput.getString();
            if (Objects.equals(input, "n")){
                isActive = false;
            }
        }

    }

    public void calculate(int num1, int num2){

        switch (operator){
            case "+":
                o = num1 + num2;
                break;
            case "-":
                o = num1 - num2;
                break;
            case "*":
                o = num1 * num2;
                break;
            case "/":
                o = num1 / num2;
                break;
            default:
                userInput.printMessage("Not an operator");
        }
        userInput.printMessage("answer is " + o);
    }



}
