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
    public float add(float x1, float x2){
        return x1+x2;
    }

    public double add(double x1, double x2){
        return x1+x2;
    }

    public float subtract(float x1, float x2){
        return x1-x2;
    }

    public String subtract(String string, char character){
        String retStr = "";
        for(int i = 0; i < string.length(); i++){
            char curr = string.charAt(i);
            if(curr != character){
                retStr += curr;
            }
        }
        return retStr;
    }

    public int multiply(int x1, int x2){
        return x1*x2;
    }

    public String multiply(String str, int num) {
        String retStr = "";
        for(int i = 0; i < num; i++) {
            retStr += str;

            if(i != num-1){
                retStr += ",";
            }
        }
        return retStr;
    }

    public int[] multiply(String[] strs, int mul){
        int strLen = strs.length;
        int[] retNums = new int[strLen];
        for(int i = 0; i < strLen; i++){
            retNums[i] = Integer.parseInt(strs[i])*mul;
        }
        return retNums;
    }
}
