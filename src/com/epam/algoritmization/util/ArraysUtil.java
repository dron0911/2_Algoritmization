package com.epam.algoritmization.util;

import java.util.Random;

public class ArraysUtil {
    //random arrays of int and double
    public static int[] createRandOneDimArrayOfInt() {
        Random random = new Random();
        int n = ConsoleReader.readIntValue("Enter array dimension: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static double[] createRandOneDimArrayOfDouble() {
        int n = ConsoleReader.readIntValue("Enter array dimension: ");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10 - 5;
        }
        return array;
    }

    //create one-dimensional arrays of int and double
    public static int[] createOneDimArrayOfInt() {
        int n = ConsoleReader.readIntValue("Enter array dimension");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ConsoleReader.readIntValue("Enter [ " + i + " ] element");

        }
        return array;
    }

    public static double[] createOneDimArrayOfDouble() {
        int n = ConsoleReader.readIntValue("Enter array dimension");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ConsoleReader.readIntValue("Enter [ " + i + " ] element");

        }
        return array;
    }

    // find minimum value in array
    public static int findArrayMin(int[] array) {
        int min = array[0];
        for (int mas : array) {
            if (min > mas) {
                min = mas;
            }
        }
        return min;
    }

    // find maximum value in array
    public static int findArrayMax(int[] array) {
        int max = array[0];
        for (int mas : array) {
            if (max < mas) {
                max = mas;
            }
        }
        return max;
    }

    //find max and min in multidimensional array
    public static int findMultiDimArrayMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int findMultiDimArrayMin(int[][] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    // create multi-dimensional arrays of int and double
    public static int[][] randomArrOfArrOfInt() {
        int n = ConsoleReader.readIntValue("Enter array dimension");
        Random random = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) - 2;
            }
        }
        return array;
    }

    public static double[][] randomArrOfArrOfDouble() {
        int n = ConsoleReader.readIntValue("Enter array dimension");
        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.random() * 10 - 5;
                ;
            }
        }
        return array;
    }

    public static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    // bubble sort in ascending order
    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
        return array;
    }

    // selection sort in descending order
    public static int[] selectionSort(int[] array) {
        int max;
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            swap(array, i, max);
        }
        return array;
    }

    // insertion sort in ascending order
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    public static int binarySearch(int[] arr, int numberToSearch, int lastInd) {
        int low = 0;
        int high = lastInd - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (numberToSearch > arr[middle]) {
                low = middle + 1;
            } else if (numberToSearch < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return low;
    }

    // shell sorting in ascending order
    public static int[] shellSort(int[] array) {
        int n = array.length;
        int counter = 0;
        for (int h = n / 2; h >= 1; h /= 2) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    ArraysUtil.swap(array, j, j - h);
                    counter++;
                }
            }
        }
        System.out.println("iterations " + counter);
        return array;
    }
}
