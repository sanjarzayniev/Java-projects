package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                tempArray[i + 1] = array[i];
            } else {
                tempArray[0] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }

    static void cycleSwap(int[] array, int shift) {
        for (int i = 0; i < shift; i++) {
            cycleSwap(array);
        }

    }
}
