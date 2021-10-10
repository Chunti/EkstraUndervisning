package com.company;

public class Dice {
    int diceValue;

    public Dice() {
        diceValue = (int) ((Math.random() * (7 - 1)) + 1);
    }

    public void rollDiceValue() {
        diceValue = (int) ((Math.random() * (7 - 1)) + 1);
    }

    public int getDiceValue() {
        return diceValue;
    }
}
