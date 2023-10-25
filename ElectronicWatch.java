package org.example;

import java.util.Scanner;

public class ElectronicWatch {
    public static String putZeroForMinute(int minutes) {
        if (minutes <= 9 && minutes >= 0) {
            return "0";
        } else {
            return "";
        }
    }

    public static String putZeroForSecond(int seconds) {
        if (seconds <= 9 && seconds >= 0) {
            return "0";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.print("Input the total seconds : ");
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds - hours * 3600) / 60;
        int seconds = totalSeconds - 3600 * hours - 60 * minutes;
        int days = hours / 24;
        if (hours >= 24) {

            hours = hours - 24*days;
        }

        System.out.println(hours + ":" + putZeroForMinute(minutes)+ minutes + ":" +putZeroForSecond(seconds) + seconds);
        scanner.close();
    }
}