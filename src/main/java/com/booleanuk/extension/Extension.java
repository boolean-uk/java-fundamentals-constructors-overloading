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
     public float add (float firstFloat, float secondFloat) {
         return firstFloat + secondFloat;
     }

    public double add (double firstDouble, double secondDouble) {
        return firstDouble + secondDouble;
    }
    public float subtract (float firstFloat, float secondFloat) {
        return firstFloat - secondFloat;
    }

    public String subtract (String someString, char someChar) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < someString.length(); i++) {
            char currentChar = someString.charAt(i);
            if (currentChar != someChar) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
    public int multiply (int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    public String multiply(String inputString, int count){
        if (count < 0) {
            throw new IllegalArgumentException("Count must be positive.");
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(inputString);
            if (i < count - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }

    public int[] multiply(String[] stringNumbers, int multiplier) {
        int[] result = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            result[i] = Integer.parseInt(stringNumbers[i]) * multiplier;
        }
        
        return result;
    }
}
