package q4;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is"+ hours + " hours, "
                + minutes + " minutes and "
                + seconds + " seconds");
    }
}