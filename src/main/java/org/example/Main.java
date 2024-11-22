package org.example;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {11, 63, 28, 17, 39};

        boolean EvenNumber = false;
        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("ამ მასივში არის ლუწი რიცხვი - " + numbers[i]);
                EvenNumber = true;
            }
        }

            if (!EvenNumber) {
                System.out.println("ამ მასივში არ არის ლუწი რიცხვები");
            }
    }
}
