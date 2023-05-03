package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    // Implement the following methods:
    // 1. add, which accepts two floats and returns a float (both floats added together)
    public float add(float num1, float num2) {
        return num1 + num2;
    }
    // 2. add, which accepts two doubles and returns a double (both doubles added together)
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    // 3. subtract, which accepts two floats and returns a float (first float minus second float)
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }
    // 4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed
    public String subtract(String str, char ch) {
        return str.replace(ch+"", "");
    }
    // 5. multiply, which accepts two ints and returns an int (first int multiplied by second int)
    public int multiply(int num1, int num2) {return num1 * num2;}
    // 6. multiply, which accepts a string and an int, and returns a string containing the provided string
    // as many times as the provided int separated by a comma. E.g.
    // multiply("Hello", 3) -> "Hello,Hello,Hello"
    public String multiply(String str, int num) {
        return (str + ",").repeat(num-1) + str;
    }
    // 7. multiply, which accepts an array of Strings that each contain a number, and an int
    // The method should return an array of ints that contain the value of multiplying each String number by the provided int
    // E.g.
    // multiply(["2", "7", "3"], 3) -> [6, 21, 9]
    public int[] multiply(String[] numbers, int multiplier) {
        int[] numArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArr[i] = Integer.parseInt(numbers[i]) * multiplier;
        }
        return numArr;
    }

}
