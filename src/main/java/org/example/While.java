package org.example;

public class While {

    public static void main(String[] args) {
        String string = "Interesting puzzles!";

        int i = 2;
        while (i < string.length()){

            char eachLetter = string.charAt(i);
            System.out.println(eachLetter);

            if (eachLetter == 'z'){
                break;
            }
        i = i + 3;

        }

    }
}
