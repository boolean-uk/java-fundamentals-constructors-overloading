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

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return Math.abs(a - b);
    }

    @Override
    public String subtract(String a, char b) {
        return a.replace(String.valueOf(b), "");
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public String multiply(String a, int b) {
        StringBuilder totalString = new StringBuilder();
        for (int i = 0; i < b; i++) {
            totalString.append(a);
            if (i < b-1) {
                totalString.append(",");
            }
        }
        return totalString.toString();
    }

    @Override
    public int[] multiply(String[] a, int b) {
        int[] ints = new int[a.length];
        int index = 0;
        for (String str : a) {
            ints[index] = Integer.parseInt(str) * b;
            index++;
        }
        return ints;
    }
}
