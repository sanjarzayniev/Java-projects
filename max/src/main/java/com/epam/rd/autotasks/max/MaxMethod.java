package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxValue = values[0];

        for (int i = 0; i < values.length; i++){
            if (values[i] > maxValue){
                maxValue = values[i];
            }
        }
         return maxValue;

    }
}
