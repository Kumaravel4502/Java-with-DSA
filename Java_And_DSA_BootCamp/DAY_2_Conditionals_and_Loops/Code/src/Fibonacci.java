import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int n = sc.nextInt();
        int a=-1,b=1;
        int c;
        for(int i=0;i<n;i++)
        {
            c=a+b;
             System.out.println(c);
             a=b;
             b=c;
        }


    }
}
