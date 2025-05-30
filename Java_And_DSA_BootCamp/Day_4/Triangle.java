
import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = s.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = s.nextDouble();
        double area = 0.5 * base * height; // Area of triangle = 1/2 * base * height
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}
