public class Dice {
    private int diceValue;

    public Dice() {
        diceValue = (int) (6*Math.random() + 1);
    }

    public void rollDiceValue() {
        diceValue = (int) (6*Math.random() + 1);
    }

    public int getDiceValue() {
        return diceValue;
    }
}
