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

    public float add(float number1, float number2){
        return number1 + number2;
    }
    public double add(double number1, double number2){
        return number1 + number2;
    }
    public float subtract(float number1, float number2){
        return number1 - number2;
    }
    public String subtract(String name, char letter){
        String replacement = String.valueOf(letter);

        return name.replace( replacement, "");

    }

    public int multiply(int number1, int number2){
        return number1*number2;
    }
    public String multiply(String name, int number1){
        String newName = name;
        for(int i=1; i<number1; i++){
            newName += "," + name ;
        }
        return newName;
    }
    public int[] multiply(String[] numbers, int number){
        int[] finalResult = new int[numbers.length];
        int[] convertNumbers = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            convertNumbers[i] = Integer.parseInt(numbers[i]);
            finalResult[i] = convertNumbers[i]*number;
        }
        return finalResult;
    }


}
