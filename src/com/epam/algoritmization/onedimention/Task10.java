package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ResultPrinter;

/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printOneDimArrayOfInt(shiftOfZeroElements(array));
    }

    public static int[] removeEverySecond(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] shiftOfZeroElements(int[] array) {
        int[] resultArray = removeEverySecond(array);
        for (int j = 0, i = 0; i < resultArray.length; i++) {
            if (resultArray[i] != 0) {
                if (j < i) {
                    int tmp = resultArray[i];
                    resultArray[i] = resultArray[j];
                    resultArray[j] = tmp;
                }
                j++;
            }
        }
        return resultArray;
    }
}
