import java.util.Random;

public class DiceRoll {
    int dice1, dice2;
    int sum;

    DiceRoll() {
        System.out.println("Rolling dice...");
        roll();
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + sum);
    }

    public void roll() {
        Random rand = new Random();
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;
        sum = dice1 + dice2;
    }

    public static void main(String arg[]) {
        new DiceRoll();

    }
}