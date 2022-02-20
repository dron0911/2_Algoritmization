package com.epam.algoritmization.sorting;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 2. Даны две последовательности a1<a2<an и b1<b2<bm.
 * Образовать из них новую последовательность чисел так,
 * чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] secondSequence = {5, 7, 9, 11, 13, 15};
        ResultPrinter.printOneDimArrayOfInt(firstSequence);
        ResultPrinter.printOneDimArrayOfInt(secondSequence);
        System.out.println("Joined sequence: ");
        ResultPrinter.printOneDimArrayOfInt(joinTwoSequence(firstSequence, secondSequence));

    }

    private static int[] joinTwoSequence(int[] array1, int[] array2) {
        int[] joinedSequence = new int[array1.length + array2.length];
        for (int p = 0, i = 0; i < joinedSequence.length; p++, i++) {
            if (i < array1.length) {
                for (int j = 0; j < array1.length; j++, i++) {
                    joinedSequence[i] = array1[j];
                }
            }
            joinedSequence[i] = array2[p];
        }
        ArraysUtil.bubbleSort(joinedSequence);
        return joinedSequence;
    }

}