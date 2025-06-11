// write a java program to print the day of the week based on user input using switch statement

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day (1-7):");
        int day = scanner.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's a weekday.");
            case 6, 7 -> System.out.println("It's a weekend.");
            default -> System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}
