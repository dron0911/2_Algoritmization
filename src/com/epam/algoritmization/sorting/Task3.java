package com.epam.algoritmization.sorting;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 3. Сортировка выбором. Дана последовательность чисел a1<a2<an.
 * Требуется переставить элементы так, чтобы они были расположены
 * по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ResultPrinter.printOneDimArrayOfInt(firstSequence);
        int[] sorted = ArraysUtil.selectionSort(firstSequence);
        System.out.println("Selection sort in descending order:");
        ResultPrinter.printOneDimArrayOfInt(sorted);
    }
}
