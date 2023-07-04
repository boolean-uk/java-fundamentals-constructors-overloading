package com.booleanuk.helpers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ExtensionBase {
    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public String subtract(String a, char b) {
        return a.replace(String.valueOf(b), "");
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String multiply(String a, int b) {

        return String.join(",", Collections.nCopies(b, a));
    }

    public int[] multiply(String[] a, int b) {
        return Arrays.stream(a).mapToInt(word -> Integer.parseInt(word) * b).toArray();
    }
}
