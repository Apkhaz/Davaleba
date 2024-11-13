package org.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String question1 = "What is your name?";
        System.out.println(question1);

        String answer1 = scanner.nextLine();

        System.out.println("Hello, " + answer1 + "!");

        String question2 = "What is your nationality?";
        System.out.println(question2);

        String answer2 = scanner.nextLine();

        System.out.println(answer2 + "!");
        {
            if (answer2.equalsIgnoreCase("Georgian")) {
                System.out.println("Me too!");
            } else {
                System.out.println("Nice!");
            }


        }






        scanner.close();

        }


    }


