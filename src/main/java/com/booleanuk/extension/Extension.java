package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import static java.lang.Integer.parseInt;

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
    public float add(float addend1, float addend2) {
        return addend1 + addend2;
    }

    public double add(double addend1, double addend2) {
        return addend1 + addend2;
    }

    public float subtract(float subtrahend1, float subtrahend2) {
        return subtrahend1 - subtrahend2;
    }

    public String subtract(String text, char character) {
        return text.replace(String.valueOf(character), "");
    }

    public int multiply(int factor1, int factor2) {
        return factor1 * factor2;
    }

    public String multiply(String text, int repeats) {
        String sometimesNamingThingsIsHard = text;
        for(int i = 0; i < repeats-1; i++) {
            sometimesNamingThingsIsHard += "," + text;
        }
        return sometimesNamingThingsIsHard;
    }

    public int[] multiply(String[] numbersAsText, int factor) {
        int[] numbers = new int[numbersAsText.length];
        for(int i = 0; i < numbersAsText.length; i++) {
            numbers[i] = parseInt(numbersAsText[i]) * factor;
        }
        return numbers;
    }
}
