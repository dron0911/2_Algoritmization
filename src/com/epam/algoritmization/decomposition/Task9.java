package com.epam.algoritmization.decomposition;


import com.epam.algoritmization.util.ConsoleReader;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {
    public static void main(String[] args) {
        int x = ConsoleReader.readIntValue("Enter x");
        int y = ConsoleReader.readIntValue("Enter y");
        int z = ConsoleReader.readIntValue("Enter z");
        int t = ConsoleReader.readIntValue("Enter t");
        double tetragonSquare = square(x, y, z, t);
        System.out.println("Square = " + tetragonSquare);
    }

    private static double square(int x, int y, int z, int t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double p = (diagonal + z + t) / 2;
        double s1 = x * y / 2.0;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
}
