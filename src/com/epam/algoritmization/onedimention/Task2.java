package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
 * большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        int[] resultArray = changeMembersAndCalculateCount(array);
        ResultPrinter.printOneDimArrayOfInt(resultArray);
    }

    public static int[] changeMembersAndCalculateCount(int[] array) {
        int z = ConsoleReader.readIntValue("Enter Z value");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.min(array[i], z);
            if (array[i] == z) {
                count++;
            }
        }
        System.out.println("count of elements: " + count);
        return array;
    }
}
