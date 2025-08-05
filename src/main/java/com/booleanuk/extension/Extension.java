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

    public float add(float f1, float f2) { return f1 + f2; }

    public double add(double d1, double d2) { return d1 + d2; }

    public float subtract(float f1, float f2) {return f1 - f2;}

    public String subtract(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public int multiply(int i1, int i2) { return i1 * i2; }

    public String multiply(String str, int n) {
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < n-1; i++) {
            strBuilder.append("," + str);
        }
        return strBuilder.toString();
    }

    public int[] multiply(String[] strs, int n) {
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]) * n;
        }
        return nums;
    }
}
