package com.practice.java;


public class MethodsExa {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result = getResult(num1, num2);
        System.out.println("add:" + result);
    }

    public static int getResult(int num1, int num2) {
        return num1 + num2;
    }
}



