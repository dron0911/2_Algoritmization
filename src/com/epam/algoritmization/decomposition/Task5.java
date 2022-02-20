package com.epam.algoritmization.decomposition;

/**
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {5, 8, 65, 9, 3, 18, 99, 54, 28, 15, 2};
        int indexOfMax = findIndexMaxElement(array);
        int indexOfSecMax = findIndexSecondMaxElement(array);
        System.out.println("Max element is: " + array[indexOfMax]);
        System.out.println("Second max element is: " + array[indexOfSecMax]);

    }

    static int findIndexMaxElement(int[] arr) {
        int maxElement = arr[0];
        int indexMaxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
                indexMaxElement = i;
            }
        }
        return indexMaxElement;
    }

    static int findIndexSecondMaxElement(int[] arr) {
        int maxElement = arr[findIndexMaxElement(arr)];
        int secondMaxElement = arr[0];
        int indexSecondMaxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (secondMaxElement < arr[i] && arr[i] < maxElement) {
                secondMaxElement = arr[i];
                indexSecondMaxElement = i;
            }
        }
        return indexSecondMaxElement;
    }
}
