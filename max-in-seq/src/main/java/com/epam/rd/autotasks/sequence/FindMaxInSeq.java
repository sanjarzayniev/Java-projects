package com.epam.rd.autotasks.sequence;

import java.util.Scanner;

public class FindMaxInSeq{
    public static int max() {
        int number = Integer.MIN_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (number != 0) {
            number = scanner.nextInt();
            if (number > maxNumber && number != 0) {
                maxNumber = number;
            }
        }

        scanner.close();
        return maxNumber;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
