
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;

public class User {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.println("Enter numbers (enter 0 to stop):");
        while (true) {
            n = s.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("The sum of all numbers is: " + sum);
    }
}
