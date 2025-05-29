import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer Value: ");
        int n = s.nextInt();
    int rem,reverse=0;
    while(n>0) {
        rem = n%10;
        reverse=(reverse*10)+rem;
        n=n/10;
    }
    System.out.println(reverse);

    }
}
