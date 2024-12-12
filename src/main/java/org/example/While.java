package org.example;

public class While {

    public static void main(String[] args) {
        String string = "Wow, interesting puzzles!";

        int i = 2;
        while (i < string.length()){

            char eachLetter = string.charAt(i);

            if (eachLetter == 'z'){
                break;
            }

            System.out.println(eachLetter);

            i = i + 3;

            // ამოცანაში ზუსტად ვერ მივხვდი Z უნდა დაიბეჭდოს თუ არა, ამიტომ ამ შემთხვევაში არ დაიბეჭდება და
            // ისე შეწყდება ციკლი. და თუ გვინდა რომ დაიბეჭდოს და მეე შეწყდეს ციკლი, მაშინ და ვწერთ ჯერ პრინტს
            // და მერე if-ს

        }

    }
}
