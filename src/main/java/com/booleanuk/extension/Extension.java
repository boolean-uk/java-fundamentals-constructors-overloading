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
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public String subtract(String str, char ch) {
        return str.replace(String.valueOf(ch),"");
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String multiply(String str, int times) {
        return (str+",").repeat(times-1) + str;
    }

    public int[] multiply(String[] strArr, int num) {
        int[] intArr = new int[strArr.length];
        for (int i=0; i<strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]) * num;
        }
        return intArr;
    }
}
