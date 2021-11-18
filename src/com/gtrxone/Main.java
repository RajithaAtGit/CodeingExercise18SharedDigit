package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,550));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int num1LDigit = number1%10;
            int num1fDigit =number1/10;
            int num2LDigit = number2%10;
            int num2fDigit = number2/10;
            return (num1fDigit == num2fDigit) || (num1fDigit == num2LDigit) || (num1LDigit == num2fDigit) || (num1LDigit == num2LDigit);

        }
        return false;
    }
}
