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
    public float add(float num1, float num2){
        float sum = num1 + num2;
        return sum;
    }
    public double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public float subtract(float num1, float num2){
        float sum = num1 - num2;
        return sum;
    }

    public String subtract(String string, char character){
        StringBuilder newString = new StringBuilder();
        for (char currenChar: string.toCharArray()){
            if (currenChar != character){
                newString.append(currenChar);
            }
        }
        return newString.toString();
    }

    public int multiply(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }

    public String multiply(String string, int num){
        StringBuilder reapeatedString = new StringBuilder();
        for (int i = 0; i < num; i++){
            if (i < num -1){
                reapeatedString.append(string).append(",");
            }
            else {
                reapeatedString.append(string);
            }
        }
        return reapeatedString.toString();
    }

    public int[] multiply(String[] array, int num){
        int [] result = new int[array.length];
        for(int i = 0; i <array.length; i++){
            int makeInt = Integer.parseInt(array[i]);
            result[i] = makeInt * num;
        }
        return result;
    }
}
