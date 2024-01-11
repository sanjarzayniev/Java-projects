package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        if (totalAmount < 0){
            System.out.println("Bill total amount cannot be negative");
            scanner.close();
            return ;
        }
        int friends = scanner.nextInt();

        if (friends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
            scanner.close();
            return ;
        }

        System.out.println((totalAmount + totalAmount/10) / friends);
        scanner.close();
    }
}
