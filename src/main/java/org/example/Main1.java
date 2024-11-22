package org.example;

public class Main1 {
    public static void main(String[] args) {

        checkNumbers(28);
        checkNumbers(-2);
        checkNumbers(0);

    }

   public static void checkNumbers (int number){
        if (number > 0) {
            System.out.println("დადებითი რიცხვი");
        }
        else if (number < 0){
            System.out.println("უარყოფითი რიცხვი");
        }
        else {
            System.out.println("ნული");
        }
    }
}
