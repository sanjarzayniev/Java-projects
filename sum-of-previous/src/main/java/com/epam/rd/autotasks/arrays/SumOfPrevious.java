package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[] { 1, -1, 0, 4, 6, 10, 15, 25 };

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1] = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + array[i + 1] == array[i + 2]) {
                result[i + 2] = true;
            } else {
                result[i + 2] = false;
            }
        }
        return result;
    }
}
