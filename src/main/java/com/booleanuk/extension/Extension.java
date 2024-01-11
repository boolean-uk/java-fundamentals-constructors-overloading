package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b ;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public String subtract(String s, char c) {
        return s.replace(String.valueOf(c), "");
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public String multiply(String s, int i) {
        StringBuilder sb = new StringBuilder(s);
        for (int j = 0; j < i-1; j++) {
            sb.append(",");
            sb.append(s);
        }
        return sb.toString();
    }

    public int[] multiply(String[] sArr, int i) {
        int[] arr = new int[sArr.length];
        for (int j = 0; j < sArr.length; j++) {
            arr[j] = Integer.valueOf(sArr[j]) * i;
        }
        return arr;
    }
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


}
