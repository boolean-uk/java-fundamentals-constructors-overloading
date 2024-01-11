package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.util.ArrayList;

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
        public float add(float num,float num2){
            return num+num2;
        }

        public double add(double num,double num2){
            return num+num2;
        }

        public float subtract(float num,float num2){
            return num-num2;
        }

        public String subtract(String word,char char1){
            return word.replace(String.valueOf(char1),"");
        }
        public int multiply(int num,int num2){
            return num*num2;
        }

        public String multiply(String word,int num2){
            String newWord ="";
            for (int i=0;i<num2;i++){
                newWord+=word+",";
            }
            return newWord.substring(0,newWord.length()-1);
        }

        public int[] multiply(String[] arr1, int num){
            int[] newArray = new int[arr1.length];
            for (int i=0;i<arr1.length;i++){
                newArray[i] = (Integer.parseInt(arr1[i]))*num;
            }
            return newArray;
        }

}
