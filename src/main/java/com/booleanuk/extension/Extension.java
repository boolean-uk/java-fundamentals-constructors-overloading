package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import static java.lang.String.valueOf;

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

    public float add (float num1, float num2) {
        float sum = (float) num1+ num2;
        return sum;
    }

    public double add (double num1, double num2) {
        double sum = (double) num1+ num2;
        return sum;
    }

    public float subtract (float num1, float num2) {
        float sum = (float) num1 - num2;
        return sum;
    }

    public String subtract (String str, char c) {
        String str1 = str.replace(String.valueOf(c), "");
        return str1;
    }

    public int multiply (int num1, int num2){
        return  num1*num2;
    }

    public String multiply (String str, int num){
        str += ",";
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            strBuilder.append(str);
        }
        str = strBuilder.toString();
        str = str.substring(0, str.length()-1);

        return str;
    }

    public int[] multiply (String[] nums, int x) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            nums1[i] = num*x;
        }

        return nums1;
    }


}
