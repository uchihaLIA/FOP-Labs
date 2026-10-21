package q6;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double mass = input.nextDouble();
        double M = mass / 1000;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = input.nextDouble();

        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double Q = M * (finalC - initialC) * 4184;

        System.out.printf("The energy needed is %.6e%n", Q);
    }
}