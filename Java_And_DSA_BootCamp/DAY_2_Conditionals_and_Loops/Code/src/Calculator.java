import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
        System.out.println("Enter an Operation to be Perform +,-,*,/,% : ");
        int c = 0;
        char ch = s.next().charAt(0);
            System.out.println("Enter the value of a : ");
            int a = s.nextInt();
            System.out.println("Enter the value of b : ");
            int b = s.nextInt();
            if (ch == '+') {
                c = a + b;
                System.out.println("The Sum is :" + c);
            }
            else if (ch == '-') {
                c = a - b;
                System.out.println("The Subraction is :" + c);

            }
            else if (ch == '*') {
                c = a * b;
                System.out.println("The Multiplication is :" + c);

            }
            else if (ch == '/') {
                c = a / b;
                System.out.println("The Division is :" + c);
            }
            else if(ch=='%')
            {
                c = a % b;
                System.out.println("The Modulus is :" + c);
            }
            else {
                System.out.println("Invalid Operation");
            }
        }

    }
}
