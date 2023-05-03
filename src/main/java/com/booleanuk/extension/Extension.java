package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {

    // Implement the following methods:

    //        1. add, which accepts two floats and returns a float (both floats added together)
    public float add(float n1, float n2) {
        return n1 + n2;
    }

    //        2. add, which accepts two doubles and returns a double (both doubles added together)
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    //        3. subtract, which accepts two floats and returns a float (first float minus second float)
    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    //        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed
    public String subtract(String  str, char c) {
        return str.replace(String.valueOf(c),"");
    }
//        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

//        6. multiply, which accepts a string and an int, and returns a string containing the provided string
//        as many times as the provided int separated by a comma. E.g.
//        multiply("Hello", 3) -> "Hello,Hello,Hello"

    @Override
    public String multiply(String a, int b) {
        return (a.concat(",")).repeat(b).substring(0,(a.concat(",")).repeat(b).length()-1);
    }
//        7. multiply, which accepts an array of Strings that each contain a number, and an int
//        The method should return an array of ints that contain the value of multiplying each String number by the provided int
//        E.g.
//        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
    @Override
    public int[] multiply(String[] a, int b) {
        int[] returningArray =new int[a.length];
        for (int i = 0; i < a.length; i++) {
            returningArray[i]=Integer.valueOf(a[i])*b;
        }
        return returningArray;
    }
}
