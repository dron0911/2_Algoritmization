package com.epam.algoritmization.decomposition;


import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.DecompositionUtil;

/**
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(А,В) = (А*В)/(НОД(А,В)).
 */
public class Task1 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a: ");
        int b = ConsoleReader.readIntValue("Enter b: ");
        int gcd = DecompositionUtil.findGCD(a, b);
        int lcm = DecompositionUtil.findLCM(a, b);
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }


}
