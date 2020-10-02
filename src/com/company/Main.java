package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] wisconsin = {"Cheese", "Battleship", "Big guns", "Packers"};
	    String[] missouri = new String[4];
        for(int i = 0; i < wisconsin.length; i++){
            System.out.println(wisconsin[i]);
            wisconsin[i] = "JT";
            missouri[i] = "avacado";
        }
        System.out.println(wisconsin.length);
        System.out.println(missouri.length);
        for (String fire: wisconsin) {
            System.out.println(fire);

        }
        for (String food: missouri) {
            System.out.println(food);
        }
    }
}
