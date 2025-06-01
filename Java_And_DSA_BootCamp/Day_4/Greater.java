//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

public class Greater {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        int G = 0;
        System.out.println("Enter numbers (enter 0 to stop):");
        while (true) {
            n = s.nextInt();
            if (n == 0) {
                break;
            }

            if (n > G) {
                G = n;
            }
        }
        System.out.println("The Greatest of all numbers is: " + G);
    }
}