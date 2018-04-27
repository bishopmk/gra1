package com.company;

import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Random random = new Random();

        int winnerNumber = random.nextInt(bound(1000));

        Scanner scanner = new Scanner(System.in);

        int userAnswer;

        do {
            System.out.print("Podaj liczbę: ");
            userAnswer = scanner.nextInt();

            if(userAnswer > winnerNumber)
            {
                System.out.println("Celuj niżej");
            } else if(userAnswer < winnerNumber)
            {
                System.out.println("Celuj wyżej");
            }
        } while (userAnswer != winnerNumber);
        System.out.println("Wygrałeś");
    }
}
