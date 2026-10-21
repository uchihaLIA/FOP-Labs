package q3;

import java.util.Random;

public class q3 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}