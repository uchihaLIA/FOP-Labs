package q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car price: ");
        double P = input.nextDouble();

        System.out.print("Enter down payment: ");
        double D = input.nextDouble();

        System.out.print("Enter interest rate (%): ");
        double R = input.nextDouble();

        System.out.print("Enter loan duration in years: ");
        int Y = input.nextInt();

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        System.out.printf("Monthly payment: RM %.2f%n", M);
    }
}