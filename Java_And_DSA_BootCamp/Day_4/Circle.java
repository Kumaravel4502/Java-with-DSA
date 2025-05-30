// package Java_And_DSA_BootCamp.Day_4;

import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        double area = 3.14 * radius * radius; // Area of circle = π * r^2
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
