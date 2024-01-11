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
    public float add(float numb1, float num2){
        float sum = num2 + numb1;
        return sum;
    }
    public double add(double numb1, double num2){
        double sum = num2 + numb1;
        return sum;
    }
    public float subtract( float num2, float numb1){
        float sum = num2 - numb1;
        return sum;
    }
    public String subtract(String word1, char bokstav){
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(bokstav);
        String sum = word1.replace(s,"");
        return sum;
    }

    public int multiply(int numb1, int num2){
        int sum = num2 * numb1;
        return sum;
    }

    public String multiply(String word, int numb1){

        StringBuilder sb = new StringBuilder();

        for (int i =0; i<numb1; i++){
            sb.append(word + ",");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    public int[] multiply(String[] arr, int numb){
        int sum=0;
        int[] newArr = new int[arr.length];
        String temp="";
        for (int i =0; i< arr.length; i++){
            temp = arr[i];
            sum = Integer.parseInt(temp)*numb;
            newArr[i]=sum;
        }
        return newArr;
    }




}
