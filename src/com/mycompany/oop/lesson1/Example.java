package com.mycompany.oop.lesson1;

public class Example {

    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 199};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
