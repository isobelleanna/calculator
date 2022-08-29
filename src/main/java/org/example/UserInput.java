package org.example;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);
    private boolean isActive;

    public void printMessage(String message){
        System.out.println(message);
    }

    public int getNumber(){
        isActive = true;
        int numberInput = 0;
        while(isActive){
            String userInput = scanner.next();
            try {
                numberInput = Integer.parseInt(userInput);
                isActive = false;
            }catch(NumberFormatException e) {
                printMessage("Your input is not an number\nEnter a number");
            }
        }
        return numberInput;
    };

    public String getOperator(){
        String userInput = scanner.next();
        return userInput;
    };

    public String getString(){
        String userInput = scanner.next();
        return userInput;
    };
}
