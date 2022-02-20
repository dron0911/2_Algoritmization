package com.epam.algoritmization.decomposition;

import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.DecompositionUtil;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a: ");
        int b = ConsoleReader.readIntValue("Enter b: ");
        int c = ConsoleReader.readIntValue("Enter c: ");
        int[] array = {a, b, c};
        System.out.println("Is numbers prime: " + isNumbersPrime(array));
    }

    private static boolean isNumbersPrime(int[] array) {
        int count = 0;
        for (int element : array) {
            if (DecompositionUtil.isSimple(element)) {
                count++;
            }
        }
        return count == array.length;
    }
}
