package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)

        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

    //1
    public float add(float num1, float num2){
        return num1 + num2;
    }
    //2
    public double add(double num1, double num2){
        return num1 + num2;
    }
    //3
    public float subtract(float num1, float num2){
        return num1 - num2;
    }
    //4
    public String subtract(String num1, char num2) {
        String num2AsString = String.valueOf(num2);
        String num1MinusNum2 = num1.replace(num2AsString, "");

        return num1MinusNum2;
    }

    //5
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    //6
    public String multiply(String num1, int num2){
        StringBuilder stringAndComma = new StringBuilder();
        for(int i = 0; i < num2; i++) {
            stringAndComma.append(num1);
            stringAndComma.append(",");
        }
        stringAndComma.deleteCharAt(stringAndComma.length()-1);
        return stringAndComma.toString();
    }

    //7
    public int[] multiply(String[] num1, int num2){
        int sum = 0;
        int[] newArr = new int[num1.length];
        String temp = "";
        for(int i = 0; i < num1.length; i++){
            temp = num1[i];
            sum = Integer.parseInt(temp) * num2;
            //num1[i] = Integer.parseInt(num1[i]);
            newArr[i] = sum;

        }
        return newArr;

    }
}
