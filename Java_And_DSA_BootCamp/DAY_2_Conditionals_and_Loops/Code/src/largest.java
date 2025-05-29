import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = s.nextInt();
        System.out.println("Enter the value of b: ");
        int b = s.nextInt();
        System.out.println("Enter the value of c: ");
        int c = s.nextInt();

        // find the largest  of three numbers

        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("The largest number three number  is :   "+max);


    }
}
