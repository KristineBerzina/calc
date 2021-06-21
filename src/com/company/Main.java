package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
  //    Number declarations

        int firstNumber;
        float secondNumber;
        float answer;

        // Number initialized
        firstNumber = 22;
        secondNumber = 7;
        answer = 0;

        //Mathematical operator
        String operator = "/";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")){
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")){
            answer = firstNumber / secondNumber;
        }

  //     System.out.println(answer);

        int five = 5;
        //five += 1; // five = five +1

  //      System.out.println(five++); //post-increment - increase by 1 after using the value

        // five = 6 now

  //      System.out.println(++five); // pre-increment - increase by 1 before using the value

        boolean sixLessThan = 6<3;
        boolean fiveGreaterThan = 5>9;

        // && - AND - only works if both statements are true
        // || - OR - works if either statement is true, only gives FALSE if both are false
        // ! - NOT
        // != - NOT EQUAL
        // == - EQUALS
        if(sixLessThan || fiveGreaterThan) {
            System.out.println("OR works");
        } else {
            System.out.println("OR was skipped");
        }

    }
}
