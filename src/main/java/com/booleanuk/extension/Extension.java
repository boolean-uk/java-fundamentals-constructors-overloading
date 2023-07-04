package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.security.PrivilegedExceptionAction;

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


    public float add(float first, float second) {
        return first + second;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public float subtract(float first, float second) {
        return first-second;
    }


    public String subtract(String word, char removed){
        String s = String.valueOf(removed);
       return word.replaceAll(s,"");
    }

    public int multiply(int first, int second){
        return first*second;
    }

    public String multiply(String word, int multi){
      word+=",";
        String repeat = word.repeat(multi);
       return repeat.substring(0,repeat.length()-1);
    }

    public int[] multiply(String[] strings, int multiply){
        int[] ints = new int[strings.length];
        for (int i = 0; i< strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]) *multiply;
        }
        return ints;

    }





}
