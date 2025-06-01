import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        switch (str) {
            case "Apple" -> System.out.println("Apple is a fruit");
            case "Carrot" -> System.out.println("Carrot is a vegetable");
            case "Dog" -> System.out.println("Dog is an animal");
            case "Cat" -> System.out.println("Cat is an animal");
            default -> System.out.println("Invalid String");
        }

        // String str1 = "Apple";
        // String str2 = "apple";
        // if (str1.equalsIgnoreCase(str2)) {
        // System.out.println("Both strings are equal using equals() method");
        // } else {
        // System.out.println("Strings are not equal using equals() method");
        // }

    }
}