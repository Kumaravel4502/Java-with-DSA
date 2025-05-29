import java.util.Scanner;
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch=s.next().charAt(0);
        if(ch>='0' && ch<='9')
        {
            System.out.println("The character "+ch+" is a Digit");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("The character "+ch+" is a Lower case Alphabet");
        }

        else if(ch>='A' && ch<='Z')
        {
            System.out.println("The character "+ch+" is a Uppercase Alphabet");
        }
        else{
            System.out.println("The character "+ch+" is a Special Character");
        }

    }
}
