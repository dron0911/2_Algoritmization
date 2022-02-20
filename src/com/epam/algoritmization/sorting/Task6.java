package com.epam.algoritmization.sorting;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
 * то продвигаются на один элемент вперед. Если a(i)>a(i+1), то производится перестановка и сдвигаются
 * на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] firstSequence = {10, 4, 8, 6, 7, 5, 9, 1, 2, 3};
        ResultPrinter.printOneDimArrayOfInt(firstSequence);
        ResultPrinter.printOneDimArrayOfInt(ArraysUtil.shellSort(firstSequence));
    }


}
