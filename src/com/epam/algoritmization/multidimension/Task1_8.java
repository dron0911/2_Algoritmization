package com.epam.algoritmization.multidimension;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ConsoleReader;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все
 * элементы одного столбца поставить на соответствующие им позиции другого, а его
 * элементы второго переместить в первый. Номера столбцов вводит пользователь с
 * клавиатуры.
 */
public class Task1_8 {
    public static void main(String[] args) {
        int[][] array = ArraysUtil.randomArrOfArrOfInt();
        int i1 = ConsoleReader.readIntValue("Column number: ");
        int i2 = ConsoleReader.readIntValue("Replace with: ");
        ResultPrinter.printMultiDimArray(array);
        ResultPrinter.printMultiDimArray(changeColumns(array, i1, i2));
    }

    private static int[][] changeColumns(int[][] array, int i1, int i2) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i][i1 - 1];
            array[i][i1 - 1] = array[i][i2 - 1];
            array[i][i2 - 1] = tmp;
        }
        return array;
    }
}
