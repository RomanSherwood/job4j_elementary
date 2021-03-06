package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
               for (; start <= finish; start++) {
                   if (min > array[start]) {
                       min = array[start];
                   }
               }
        return min;
    }
}
