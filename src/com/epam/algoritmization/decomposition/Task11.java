package com.epam.algoritmization.decomposition;

import com.epam.algoritmization.util.DecompositionUtil;

/**
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int number1 = 1234;
        int number2 = 1234;
        System.out.println(whichNumberIsBigger(number1, number2));
    }

    public static String whichNumberIsBigger(int a, int b) {
        int count1 = DecompositionUtil.countOfDigitsInNumber(a);
        int count2 = DecompositionUtil.countOfDigitsInNumber(b);
        if (count1 == count2) {
            return "equal number of digits";
        }
        return count1 > count2 && count1 > 0 && count2 > 0 ? "first is bigger" : "second is bigger";
    }
}
