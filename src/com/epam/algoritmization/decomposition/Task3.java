package com.epam.algoritmization.decomposition;


import com.epam.algoritmization.util.ConsoleReader;

/**
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */
public class Task3 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a: ");
        System.out.println("The area of hexagon = " + squareCounter(a));
    }

    public static double squareCounter(double a) {
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
    }
}
