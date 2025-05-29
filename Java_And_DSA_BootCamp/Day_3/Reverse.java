public class Reverse {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int n = s.nextInt();
        int reversedNumber = 0;

        while (n > 0) {
            int rem = n % 10;
            reversedNumber = (reversedNumber * 10) + rem;
            n = n / 10;
        }

        System.out.println("Reversed number is: " + reversedNumber);
        s.close();
    }
}
