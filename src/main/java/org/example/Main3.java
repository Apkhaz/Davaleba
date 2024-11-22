package org.example;

public class Main3 {

    public static void main(String[] args) {

        hasTeen(2,15,9);
        hasTeen(0,5,8);
        hasTeen(13,18,19);
    }

    public static void hasTeen (int x, int y, int z){

        if ((x >= 13 && x <=19) || (y >= 13 && y <=19) || (z >= 13 && z <=19)){
            System.out.println("True");

        }
        else {
            System.out.println("False");
        }
    }
}
