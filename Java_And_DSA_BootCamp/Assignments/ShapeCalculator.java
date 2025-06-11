import java.util.*;

public class ShapeCalculator {

    // Area calculations
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfIsoscelesTriangle(double base, double height) {
        return 0.5 * base * height; // Same as a general triangle if base and height are known
    }

    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    public static double areaOfRhombus(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Perimeter calculations
    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    public static double perimeterOfParallelogram(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }

    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }

    public static double perimeterOfRhombus(double side) {
        return 4 * side;
    }

    // Volume calculations
    public static double volumeOfCone(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public static double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double volumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static double volumeOfPyramid(double baseArea, double height) {
        return (1.0 / 3.0) * baseArea * height;
    }

    // Surface Area calculations
    public static double curvedSurfaceAreaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double totalSurfaceAreaOfCube(double side) {
        return 6 * side * side;
    }

    public static void main(String[] args) {
        System.out.println("Shape Calculations:");

        // Area examples
        System.out.println("Area of Circle (radius 5): " + areaOfCircle(5));
        System.out.println("Area of Triangle (base 10, height 5): " + areaOfTriangle(10, 5));
        System.out.println("Area of Rectangle (length 4, width 6): " + areaOfRectangle(4, 6));
        System.out.println("Area of Isosceles Triangle (base 8, height 7): " + areaOfIsoscelesTriangle(8, 7));
        System.out.println("Area of Parallelogram (base 9, height 5): " + areaOfParallelogram(9, 5));
        System.out.println("Area of Rhombus (diagonal1 10, diagonal2 8): " + areaOfRhombus(10, 8));
        System.out.println("Area of Equilateral Triangle (side 6): " + areaOfEquilateralTriangle(6));

        System.out.println("\nPerimeter examples:");

        // Perimeter examples
        System.out.println("Perimeter of Circle (radius 7): " + perimeterOfCircle(7));
        System.out.println("Perimeter of Equilateral Triangle (side 5): " + perimeterOfEquilateralTriangle(5));
        System.out.println("Perimeter of Parallelogram (sideA 5, sideB 8): " + perimeterOfParallelogram(5, 8));
        System.out.println("Perimeter of Rectangle (length 7, width 3): " + perimeterOfRectangle(7, 3));
        System.out.println("Perimeter of Square (side 4): " + perimeterOfSquare(4));
        System.out.println("Perimeter of Rhombus (side 6): " + perimeterOfRhombus(6));

        System.out.println("\nVolume examples:");

        // Volume examples
        System.out.println("Volume of Cone (radius 3, height 7): " + volumeOfCone(3, 7));
        System.out.println("Volume of Prism (base area 20, height 5): " + volumeOfPrism(20, 5));
        System.out.println("Volume of Cylinder (radius 4, height 10): " + volumeOfCylinder(4, 10));
        System.out.println("Volume of Sphere (radius 6): " + volumeOfSphere(6));
        System.out.println("Volume of Pyramid (base area 25, height 8): " + volumeOfPyramid(25, 8));

        System.out.println("\nSurface Area examples:");

        // Surface Area examples
        System.out.println("Curved Surface Area of Cylinder (radius 3, height 8): " + curvedSurfaceAreaOfCylinder(3, 8));
        System.out.println("Total Surface Area of Cube (side 5): " + totalSurfaceAreaOfCube(5));
    }
} 