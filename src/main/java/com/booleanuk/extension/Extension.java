package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

import java.util.Arrays;

public class Extension extends ExtensionBase {
        //Implement the following methods:

        //1. add, which accepts two floats and returns a float (both floats added together)

        public float add(float num1, float num2) {
            return (float) (num1 + num2);
        }
        //2. add, which accepts two doubles and returns a double (both doubles added together)

        public double add(double num1, double num2) {
            return (double) (num1 + num2);
        }

        //3. subtract, which accepts two floats and returns a float (first float minus second float)

        public float subtract(float num1, float num2) {
            return (float) (num1 - num2);
        }

        //4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        public String subtract(String string, char character) {
            return string.replace(String.valueOf(character), "");
        }

        //5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        public int multiply(int num1, int num2) {
            return (num1 * num2);
        }

        //6. multiply, which accepts a string and an int, and returns a string containing the provided string
        //as many times as the provided int separated by a comma. E.g.
        //multiply("Hello", 3) -> "Hello,Hello,Hello"

        public String multiply(String string, int num) {
            String result = "";
            String comma = ",";

            for (int i = 0; i < num; i++) {
                result = result.concat(string).concat(comma);

            }
            result = result.substring(0, result.length() - 1);
            return result;
        }

        //7. multiply, which accepts an array of Strings that each contain a number, and an int
        //The method should return an array of ints that contain the value of multiplying each String number by the provided int
        //E.g.
        //multiply(["2", "7", "3"], 3) -> [6, 21, 9]

        public int[] multiply(String[] numbers, int nums) {
            int[] empty = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                empty[i] = Integer.parseInt(numbers[i]) * nums;
            }

            return empty;
        }
}
