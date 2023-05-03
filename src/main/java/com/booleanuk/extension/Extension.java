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

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public String subtract(String str, char jenifer) {
        String jeniferButString = "" + jenifer;
        return str.replace(jeniferButString, "");
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

//        6. multiply, which accepts a string and an int, and returns a string containing the provided string
//    as many times as the provided int separated by a comma. E.g.
//            multiply("Hello", 3) -> "Hello,Hello,Hello"

    // create the method multiply which accepts the parameters String and int.
    public String multiply(String a, int num){
//        int count = 0;
        String str = "";
        for (int i = 0; i < num; i++) {
            str = str + a + ",";
//            count = count + 1;
        }
        return str.substring(0, str.length()-1);
//        System.out.println(count);
    }

//     7. multiply, which accepts an array of Strings that each contain a number, and an int
//    The method should return an array of ints that contain the value of multiplying each String number by the provided int
//        E.g.
//                multiply(["2", "7", "3"], 3) -> [6, 21, 9]

//Create a method named multiply, input parameters string array and an int
// returns an int array
    public int[] multiply(String[] stringArray, int num) {
        // Create a new int array and initialize it's length
        int[] intArray = new int[stringArray.length];
        //Loop through string array
        for (int i = 0; i < stringArray.length; i++) {
            //Save the result value to the int array after you multiply it. Make sure the string is formatted to integer.
            intArray[i] = Integer.parseInt(stringArray[i]) * num;
        }
        return intArray;

        // Return the int array
    }
}


