package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.sql.Array;

public class Extension extends ExtensionBase {

    public float add(float one, float two){
        return one+two;
    }

    public double add(double one, double two){
        return one+two;
    }

    public float subtract(float one, float two){
        return one-two;
    }

    public String subtract(String str, char chr){
        String ans = str.replace(chr, ' ');
        return ans.replaceAll("\\s+","");

    }

    public int multiply(int one, int two){
        return one*two;
    }

    public String multiply(String str, int n){
        StringBuilder k = new StringBuilder();
        for (int i = 0; i <= n-1; i++){
            k.append(str);
            if (i != n-1){
                k.append(",");
            }
        }
        return k.toString();
    }

    public int[] multiply(String[] str, int n) {
        int[] ans = new int[3];
        for (int i = 0; i <= str.length - 1; i++) {
            ans[i] = Integer.parseInt(str[i]) * n;
        }
        return ans;
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
