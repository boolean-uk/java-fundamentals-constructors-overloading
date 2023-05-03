package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.util.Locale;

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
        public float add (float num1,float num2){
            return num1+num2;
        }
        public double add(double num1,double num2){
            return num1+num2;
        }
        public float subtract (float num1,float num2){
            return num1-num2;
        }

        public String subtract (String target, char value){
            String retVal ="";
            for(int i=0;i<target.length();i++){
                if(target.charAt(i)==value){
                    continue;
                }else{
                    retVal+=target.charAt(i);
                }
            }
            return retVal;
        }
        public int multiply (int num1, int num2){
            return num1*num2;
        }
        public String multiply(String value, int numOfRepetitions){
            String retVal ="";
            for(int i=0;i<numOfRepetitions-1;i++){
                retVal +=value;

                retVal +=",";
            }
            retVal+=value;
            return retVal;
        }
        public int[] multiply(String[] numbersInString, int timesMultiplied){
            int[] retVal = new int[numbersInString.length];
            int temp;
            for(int i=0;i<numbersInString.length;i++){
                temp = Integer.parseInt(numbersInString[i]);
                retVal[i] = temp*timesMultiplied;
            }
            return retVal;
        }



}
