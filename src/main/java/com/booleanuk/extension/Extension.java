package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {

        //Implement the following methods:

       // 1. add, which accepts two floats and returns a float (both floats added together) */

        public float add(float numOne, float numTwo) {
        float sum = numOne + numTwo;
        return sum;
    }

       // 2. add, which accepts two doubles and returns a double (both doubles added together) */

        public double add(double numOne, double numTwo) {
            double sum = numOne + numTwo;
            return sum;
        }

       // 3. subtract, which accepts two floats and returns a float (first float minus second float) */

        public float subtract(float numOne, float numTwo) {
            float sum = numOne - numTwo;
            return sum;
        }





       // 4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed
       public String subtract(String text, char letter) {
           StringBuilder sb = new StringBuilder();
           for (int i = 0; i < text.length(); i++) {
               char currentChar = text.charAt(i);

               if (currentChar != letter) {
                   sb.append(currentChar);
               }


           }

           return sb.toString();

       }

      //  5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

       public int multiply(int numOne, int numTwo) {
            int sum = numOne * numTwo;

            return sum;
       }

      //  6. multiply, which accepts a string and an int, and returns a string containing the provided string
     //   as many times as the provided int separated by a comma. E.g.
      //  multiply("Hello", 3) -> "Hello,Hello,Hello"

       public String multiply(String text, int number) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < number; i++) {
                sb.append(text + ",");


            }
            sb.deleteCharAt(sb.length() - 1);
         return sb.toString();
       }

       // 7. multiply, which accepts an array of Strings that each contain a number, and an int
       // The method should return an array of ints that contain the value of multiplying each String number by the provided int
       // E.g.
      //  multiply(["2", "7", "3"], 3) -> [6, 21, 9]

       public int[] multiply(String[] arrNum, int num) {
            int result[] = new int[arrNum.length];

            for (int i = 0; i < arrNum.length; i++) {
                int curNum = Integer.parseInt(arrNum[i]);
                result[i] = curNum * num;
            }
            return result;
       }



}
