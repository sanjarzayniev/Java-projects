package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = scanner.nextInt();
        int numofPiecesPerPizza = scanner.nextInt();
        int minNumOfPizzas = 1;

        while ((minNumOfPizzas * numofPiecesPerPizza) % numOfPeople != 0){
            minNumOfPizzas = minNumOfPizzas + 1;
        }

        System.out.println(minNumOfPizzas);
        scanner.close();
    }
}
