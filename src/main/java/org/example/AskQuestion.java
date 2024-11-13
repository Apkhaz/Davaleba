package org.example;
import java.util.Scanner;

public class AskQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String question = "What is your name?";

        System.out.println(question);

        String answer = scanner.nextLine();



    }

}
