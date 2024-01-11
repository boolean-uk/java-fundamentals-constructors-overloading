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

    public float add(float float1, float float2) {
        return float1 + float2;
    }

    public double add(double double1, double double2) {
        return double1 + double2;
    }

    public float subtract(float float1, float float2) {
        return float1 - float2;
    }

    public String subtract(String string1, char c) {
        return string1.replaceAll(String.valueOf(c), "");
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String multiply(String text, int repeatTimes) {
        text += ",";
        text = text.repeat(repeatTimes);
        return text.substring(0,text.length()-1);
    }

//    7. multiply, which accepts an array of Strings that each contain a number, and an int
//    The method should return an array of ints that contain the value of multiplying each String number by the provided int
//        E.g.
//                multiply(["2", "7", "3"], 3) -> [6, 21, 9]

    public int[] multiply(String[] stringArray, int factor) {
        int[] intArray = new int[stringArray.length];
        for(int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]) * factor;
        }
        return intArray;
    }
}
