import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter t number of terms in the series:");
        int n = s.nextInt();
        int rem, count = 0;
        // while (n > 0) {
        // rem = n % 10;
        // if (rem == 3) {
        // count++;
        // }
        // n = n / 10;
        // }
        for (int temp = n; temp > 0; temp = temp / 10) {
            rem = temp % 10;
            if (rem == 3) {
                count++;
            }

            System.out.println("The number of 3's in " + n + " is: " + count); // s.close();
        }

    }
}