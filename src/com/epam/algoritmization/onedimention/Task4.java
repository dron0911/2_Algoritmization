package com.epam.algoritmization.onedimention;

import com.epam.algoritmization.util.ArraysUtil;
import com.epam.algoritmization.util.ResultPrinter;

/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
 * наименьший элементы
 * */
public class Task4 {
    public static void main(String[] args) {
        int[] array = ArraysUtil.createRandOneDimArrayOfInt();
        ResultPrinter.printOneDimArrayOfInt(array);
        ResultPrinter.printOneDimArrayOfInt(changeMaxMin(array));
    }

    public static int[] changeMaxMin(int[] array){
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = ArraysUtil.findArrayMin(array);
            maxIndex = ArraysUtil.findArrayMax(array);
        }
        ArraysUtil.swap(array,maxIndex,minIndex);
        return array;
    }
}
