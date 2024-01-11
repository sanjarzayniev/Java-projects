package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (number < 0) { 
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] array = new String[number];
            Scanner _scanner = new Scanner(System.in);
            for(int i = 0; i < number; i++) {
                array[i] = _scanner.nextLine();
            }
            for (int j = 0; j < number; j++){
                System.out.println("Hello, " + array[j]); 
            }
            _scanner.close();
        }
        scanner.close();
    }
}
