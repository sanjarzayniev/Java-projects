package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int number = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;

        while (number != 0) {
            number = scanner.nextInt();
            count = count + 1;
            sum = sum + number;
        }

        System.out.println(sum / (count - 1));
        scanner.close();
    }

}