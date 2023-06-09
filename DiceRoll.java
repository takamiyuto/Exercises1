import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    int dice1, dice2;
    int sum;
    String userName;

    DiceRoll() {
        greeting();
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

    public void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name?\n>");
        userName = sc.next();
        System.out.println("Hello, "+userName+"!");
    }
    public static void main(String arg[]) {
        new DiceRoll();

    }
}