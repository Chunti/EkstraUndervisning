package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Write the number of dices");
        int number = input.nextInt();

        for (int i = 0; i > number; i++) {
            dices.add(new Dice());
            dices.get(i).rollDiceValue();
            numbers.add(dices.get(0).getDiceValue());
            System.out.println("Ny Værdig: " + dices.get(i).getDiceValue() + " Gammel værdig: " + numbers.get(5));
        }
    }
}
