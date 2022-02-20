package com.epam.algoritmization.decomposition;

import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.DecompositionUtil;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a: ");
        int b = ConsoleReader.readIntValue("Enter b: ");
        int c = ConsoleReader.readIntValue("Enter c: ");
        int d = ConsoleReader.readIntValue("Enter d: ");
        int[] array = {a, b, c, d};
        int gcd = DecompositionUtil.findGCDInArray(array);
        System.out.println("Greatest common divisor = " + gcd);
    }

}
