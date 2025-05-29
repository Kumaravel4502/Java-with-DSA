package Starting;

import java.util.Arrays;

public class FirstProgram // pascal case FirstProgram
{
        public static void main(String[] args) {

                // variable and Datatypes

                // int ticketPrice, amt, var1; // variable declaration -- Datatypes
                // ticketPrice = 800;
                // ticketPrice = 1000;
                // amt = 2000;
                // var1 = ticketPrice + amt;
                // System.out.println("The ticket Price is " + ticketPrice);
                // System.out.println("The amount is " + var1);
                // System.out.println("Data type of G: " + amt.getClass().getName());

                // literals

                // // Initialize integer variable ticketPrice with an octal literal
                // int ticketPrice = 010;

                // // Initialize boolean variable soldOut with a false value
                // boolean soldOut = false;

                // // Initialize char variable ch with a character literal '0'
                // char ch = '0';

                // // Initialize float variable price with a floating-point literal
                // float price = 10.5f;

                // // Initialize double variable amount with a floating-point literal
                // double amount = 100.50;

                // // Initialize String variable message with a string literal
                // String message = "Ticket is sold out";

                // // Print the value of ticketPrice
                // System.out.println("The ticket Price is " + ticketPrice);

                // // Print the value of soldOut
                // System.out.println("Is ticket sold out? " + soldOut);

                // // Print the value of ch
                // System.out.println("The character is " + ch);

                // // Print the value of price
                // System.out.println("The price is " + price);

                // // Print the value of amount
                // System.out.println("The amount is " + amount);

                // // Print the value of message
                // System.out.println("The message is " + message);

                /*
                 * 
                 * //Type conversion
                 * 
                 * byte a=5; //1 byte
                 * short b=a; //2 bytes
                 * int c=b; //4 bytes
                 * long d=c; //8 bytes
                 * float e=d; //4 bytes
                 * double f=e; //8 bytes
                 * System.out.println("The value of a is "+a);
                 * System.out.println("The value of b is "+b);
                 * System.out.println("The value of c is "+c);
                 * System.out.println("The value of d is "+d);
                 * System.out.println("The value of e is "+e);
                 * System.out.println("The value of f is "+f);
                 * 
                 * //widening primitive conversion // converting smaller datatype into larger
                 * datatype
                 * double g=10.5;
                 * float h=(float)g; // explicit type casting
                 * System.out.println("The value of h is "+h);
                 * 
                 * //narrowing primitive conversion // converting larger datatype into smaller
                 * datatype
                 * int i=10;
                 * byte j=(byte)i; // explicit type casting
                 * System.out.println("The value of j is "+j);
                 * 
                 * //automatic type conversion
                 * String s="10";
                 * int k=Integer.parseInt(s); // parsing string to integer
                 * System.out.println("The value of k is "+k);
                 * 
                 * //explicit type conversion
                 * String t="10.5";
                 * double l=Double.parseDouble(t); // parsing string to double
                 * System.out.println("The value of l is "+l);
                 * 
                 */

                // // write a java program to store student details

                // String Name = "Kumaravel";
                // int Age = 19;
                // String Branch = "BCA";
                // String year = "3rd Year";
                // String place = "Chennai";
                // int fee = 10000;
                // System.out.println("Student Details:");
                // System.out.println("Name: " + Name);
                // System.out.println("Age: " + Age);
                // System.out.println("Branch: " + Branch);
                // System.out.println("Year: " + year);
                // System.out.println("Place: " + place);
                // System.out.println("Fee: " + fee);

                // // write a java program to fint Area of a circle

                // int r=5;
                // double Area=3.14*r*r;
                // System.out.println("The area of the circle is "+Area);

                // // write a java program to find the largest of two numbers using conditional
                // operator

                // int a=20;
                // int b=50;
                // int result= a > b ? a : b; // conditional operator
                // System.out.println(result);

                // // write a java program to check the given number is Even or odd

                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter a number:");
                // int num = s.nextInt();
                // if (num % 2 == 0) {
                // System.out.println("The number is even");
                // } else {
                // System.out.println("The number is odd");
                // }

                // // write a java program to check th given number is positive or negative

                // int number=-20;
                // String result = number<0 ? "Positive" : "Negative"; // conditional operator
                // System.out.println(result);

                // // write a java program to check th given name is valid or invalid

                // String Name="Kumar";
                // String result=Name=="Kumar" ? "Valid" : "Invalid";
                // System.out.println(result);

                // // write a java program to find the student is pass or fail in exam
                // //input english=75
                // // maths=25

                // String name="Kumar";
                // int english=75;
                // int maths=25;
                // String result=maths >= 35 && english >= 35 ? "Pass" : "Fail";
                // System.out.println("The student "+name+" is "+result+" in the exam");

                // // write a java program to validate username and user passward is valid or
                // not

                // String username="kumar";
                // String userpassward="kumar123";
                // String res=username=="kumar" && userpassward=="kumar123" ? "valid" :
                // "invalid";
                // System.out.println(res);

                // // write a java program to check the given number is divisible by 3 and 5

                // int num=15;
                // if (num % 3 == 0 && num % 5 == 0)
                // {
                // System.out.println("Agith weds Shalini");
                // }
                // else if(num % 3 == 0)
                // {
                // System.out.println("Agith");
                // }

                // else if(num % 5 == 0)
                // {
                // System.out.println("Shalini");
                // }

                // else{
                // System.out.println("Break up");
                // }

                // writ a java program to ckech the given number is Digit or not

                // char digit='1';
                // String result= digit>='0' && digit <= '9' ? " is a digit" : "Not a digit";
                // System.out.println("The Given value "+(digit )+ result);

                // WAJP to find Leap year or not

                // int year = 2024;
                // if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                // System.out.println("The given Year " + year + " is a leap year");
                // }

                // else {
                // System.out.println("The given Year " + year + " is not a leap year");
                // }

                // using conditional operator

                // int Year=2018;
                // String result=(Year % 4 == 0 && (Year % 100 != 0 || Year % 400 == 0)) ? "is a
                // leap year" : " is Not a leap year";
                // System.out.println("The given Year "+result);

                // WAJP to check the given month is valid or not

                // String month="June";
                // String result=month == "January" || month == "February" || month == "March"
                // || month == "April" || month == "May" || month == "June" || month == "July"
                // || month == "August" || month == "September" || month == "October" || month
                // == "November" || month == "December" ? "Valid" : "Invalid";
                // System.out.println("The given month "+month+" is "+result);

                // WAJO to find the largest of three numbers

                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter the value of a:");
                // int num = s.nextInt();
                // System.out.println("Enter the value of b:");
                // int num1= s.nextInt();
                // System.out.println("Enter the value of c:");
                // int num2 = s.nextInt();
                // int result = (num > num1 && num > num2) ? num: (num1 > num && num1 > num2) ?
                // num1 :num2;
                // System.out.println("The largest of " +num+" , "+num1+" , " +num2+" , "+ " is
                // "+result); // using conditional operator

                // WAJP to check the number is in Upper case or lower Case or Digit or special
                // Character //using conditional operator

                // int value=99;
                // String result=(value>='0' && value<='9')? "Digit" : (value >='A' && value
                // <='Z')? "Uppercase": (value >='a' && value <='z')? "Lowercase" : "Special
                // Character";

                // System.out.println("The Given value "+value+" "+"It's character value
                // "+(char) value +" is In the form of "+result);

                /**
                 * Checks if the player has reached the next level based on their current
                 * experience and the level threshold.
                 * 
                 * @return true if the player has reached the next level, false otherwise
                 * 
                 *         Example:
                 *         If the player has 10 experience points and the threshold to reach the
                 *         next level is 5,
                 *         and they receive a reward of 5 experience points, they will reach the
                 *         next level.
                 */

                // solution

                // int experience=10;
                // int threshold=5;
                // int reward=5;

                // String result=(experience>threshold)? "Eligible for reward of "+reward : "Not
                // Eligible for reward";
                // System.out.println("The candidate with "+experience+" years of experience is
                // "+result); //using conditional

                // Consider an arithmetic expression of the form a#b=c. Check whether it is
                // possible to replace & with one of the four signs: +,-,*,/ to obtain correct
                // expression.

                // int a = 2;
                // int b = 3;
                // int c = 5;
                // if ((a + b == c) || (a - b == c) || (a * b == c) || (a / b == c))
                // System.out.println("Possible to replace # with one of the four signs");
                // else
                // System.out.println("Not possible to replace # with one of the four signs");
                // // using logical

                // SWITCH
                // int a,b;
                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter first Number : ");
                // a=s.nextInt();
                // System.out.println("Enter the Second Number: ");
                // b=s.nextInt();
                // char operator;
                // System.out.println("Enter the operation to be performed : + , - , * , / , and
                // % ");
                // operator=s.next().charAt(0);
                // switch(operator){
                // case '+' :
                // System.out.println(a + "+" + b + "=" + (a+b));
                // break;

                // case '-' :
                // System.out.println(a + "-" + b + "=" + (a-b));
                // break;

                // case '*' :
                // System.out.println(a + "*" + b + "=" + (a*b));
                // break;

                // case '/' :
                // System.out.println(a + "/" + b + "=" + (a/b));
                // break;

                // case '%' :
                // System.out.println(a + "%" + b + "=" + (a%b));
                // break;
                // default:
                // System.out.println("You have Entered incorrect Symbol");

                // }

                // WAJP to print month names for the given month number.

                // int num;
                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter The Month Number you want to check: ");
                // num = s.nextInt();
                // switch (num) {
                // case 1:
                // System.out.println("January");
                // break;

                // case 2:
                // System.out.println("February");
                // break;

                // case 3:
                // System.out.println("March");
                // break;

                // case 4:
                // System.out.println("April");
                // break;

                // case 5:
                // System.out.println("May");
                // break;

                // case 6:
                // System.out.println("June");
                // break;

                // case 7:
                // System.out.println("July");
                // break;

                // case 8:
                // System.out.println("August");
                // break;

                // case 9:
                // System.out.println("September");
                // break;

                // case 10:
                // System.out.println("October");
                // break;

                // case 11:
                // System.out.println("November");
                // break;

                // case 12:
                // System.out.println("December");
                // break;
                // default:
                // System.out.println("Invalid month");
                // break;
                // }

                // Odd or Even using switch

                // int num;
                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter The Number : ");
                // num=s.nextInt();
                // int res=num%2;
                // switch(res)
                // {
                // case 0:
                // System.out.println(num+" is Even");
                // break;
                // case 1:
                // System.out.println(num+" is Odd");
                // break;
                // default:
                // System.out.println("Error");
                // break;
                // }

                // Print if an alphabet is vowel or consonant using Switch.

                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter the Alphabet You Want to Check: ");
                // char Vowels=s.next().charAt(0);
                // switch(Vowels){
                // case 'a':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'e':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'i':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'o':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'u':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'A':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'E':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'I':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'O':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // case 'U':
                // System.out.println("The Given Letter "+Vowels+" is a Vowel");
                // break;

                // default:
                // System.out.println("The Given Letter "+Vowels+" is a Consonant");
                // break;
                // }

                // Arrays

                // int marks[][]=new int[3][4]; //two dimensional array
                // marks[0][0]=52;
                // marks[0][1]=45;
                // System.out.println(marks[0][1]);

                // char[] c1 = new char[4]; //One dimensional Array
                // char[] c2 = new char[4];
                // char[] c3 = new char[4];
                // c1 = new char[] { 'a', 'j', 'y', 'b', 'c', 'd' };

                // c2 = new char[] { 'E', 'F', 'G', 'H' };

                // c3 = new char[] { 'i', 'j', 'k', 'l' };
                // System.out.println(c1[4]);
                // System.out.println(c2);
                // System.out.println(c3);

                // System.out.println("c1: " + java.util.Arrays.toString(c1)); // Output: [a, j,
                // y, b, c, d]
                // System.out.println("c2: " + java.util.Arrays.toString(c2)); // Output: [e, f,
                // g, h]
                // System.out.println("c3: " + java.util.Arrays.toString(c3)); // Output: [i, j,
                // k, l]

                // //For loops

                // // WAJP to print the number from 1 to 500 which are divisible by 5 and 7.

                // for(int i=1;i<=500;i++)
                // {
                // if(i%5==0 && i%7==0)
                // {
                // System.out.println(i);
                // }
                // }

                // WAJP to print uppercase alphabet from A to Z.

                // int ch;
                // for(ch=65;ch<=90;ch++)
                // {
                // System.out.println((char)ch);
                // }

                // simple while loop
                // WAJP to print number from 1 to 5.

                // int i=1;
                // while(i<=5)
                // {
                // System.out.println(i);
                // i++;
                // }

                // WAJP to print number from 20 to 1..

                // int i=20;
                // while(i>=1)
                // {
                // System.out.println(i);
                // i--;
                // }

                // // WAJP to print "hello" for 3 times and "Bye" for 3 times usinfg single
                // loop.

                // int no=1;
                // while(no<=6)
                // {
                // if(no<=3)
                // {
                // System.out.println("Hello");
                // }
                // else{
                // System.out.println("Bye");
                // }
                // no++;
                // }

                // WAJP to find the sum of even number from 1 to 10.

                // int i=1;
                // int sum=0;
                // while(i<=10)
                // {
                // if (i % 2 == 0)
                // {
                // sum+=i;
                // }
                // i++;
                // }
                // System.out.println("The sum of even number from 1 to 10 is "+sum);

                // WAJP to find the count of even numbers from 1 to 10.

                // int i = 1;
                // int count = 0;
                // while (i <= 10) {
                // if (i % 2 == 0) {
                // count++;
                // }
                // i++;
                // }
                // System.out.println(count);

                // WAJP to find the count of number which are divisible by 5 and 7 between 1 to
                // 100.

                // int num=1;
                // int count=0;
                // while(num<=100)
                // {
                // if(num%5==0 && num%7==0)
                // {
                // count++;
                // }
                // num++;
                // }
                // System.out.println("The count is " +count);

                // WAJP to find x^n value.

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value of x: ");
                // int x=s.nextInt();
                // System.out.println("Enter the value of n: ");
                // int n=s.nextInt();
                // int result=1;
                // // for(int i=1;i<=n;i++)
                // // {
                // // result=result*x;
                // // }
                // // System.out.println("The value of x^n is:" +result);

                // while (n>0)
                // {
                // result=result*x;
                // n--;
                // }
                // System.out.println("The value of x^n is:" +result);

                // WAJP to count the number of digits in the given number

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value : ");
                // int x=s.nextInt();
                // int count=0;
                // // while (x>0) {
                // // x=x/10;
                // // count++;
                // // }
                // for(int i=0;x>0;i++)
                // {
                // x=x/10;
                // count++;
                // }
                // System.out.println("The number of digits in the given number is:" +count);

                // WAJP to count the factors of given number

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value : ");
                // int num=s.nextInt();
                // int i=1;
                // int count=0;
                // while (i<=num)
                // {
                // if(num%i==0)
                // {
                // count++;
                // }
                // i++;
                // }
                // System.out.println("The number of factors in the given number is:" +count);

                // find the count of number which is divisible by both 5 and 7.
                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value : ");
                // int num=s.nextInt();
                // int count=0;
                // int i=1;
                // while(i<=num)
                // {
                // if(i%5==0 && i%7==0)
                // {
                // System.out.println("The number which is divided by 5 and 7 is "+i+" "+"the
                // count is "+count);
                // count++;
                // }
                // i++;
                // }
                // System.out.println("The total count is "+count);

                // using single loop to execute nested for loop

                // for(int j=1;j<=5;j++)
                // {
                // System.out.print("*".repeat(5));
                // System.out.println();
                // }

                // int i=6;
                // for(i=6;i>=1;i--)
                // {
                // for(int j=1;j<=i;j++)
                // {
                // System.out.print(j);
                // }
                // System.out.println("\n");
                // }

                // WAJP to find the nearest number divide by 10 that is less than or equal to n.

                // Scanner s=new Scanner (System.in);
                // System.out.println("Enter the value : ");
                // int num=s.nextInt();
                // while(num>0)
                // {
                // if(num%10==0)
                // {
                // System.out.println("The number is "+num);
                // break;
                // }
                // num--;
                // }

                // Find the sum of all the inputs Entered.

                // double n ,sum=0.0;
                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the inputs: ");
                // while(true)
                // {
                // n=s.nextDouble();
                // sum+=n;
                // if(n<0.0)
                // {
                // break;
                // }
                // }
                // System.out.println("The sum is "+sum);

                // Scanner s=new Scanner (System.in);
                // System.out.println("Enter the value : ");
                // int num=s.nextInt();
                // int i=1;int count=0;
                // while(i<=num)
                // {
                // if(num%i==0)
                // {
                // count++;
                // }
                // i++;
                // }
                // if(count==2)
                // {
                // System.out.println(num+" is a prime number");
                // }
                // else{
                // System.out.println(num+" is not a prime number");
                // }

                // WAJP Print all numbers less than 100 except numbers divisible by both 4 and
                // 6. Use continue in your program.

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value : ");
                // int n=s.nextInt();
                // int i=1;
                // while(i<100)
                // {
                // if(i%4==0 && i%6==0)
                // {
                // i++;
                // continue;
                // }
                // System.out.println(i);
                // i++;
                // }

                // Scanner s=new Scanner(System.in);

                // System.out.println("What is your Name? : ");
                // String name=s.nextLine();

                // System.out.println("How old are you? : ");
                // int age=s.nextInt();

                // s.nextLine();

                // System.out.println("What is your favourite Food? : ");
                // String food=s.nextLine();

                // System.out.println("Hello "+name);
                // System.out.println("You are "+age+" years old");
                // System.out.println("Your Favourite Food is "+food);

                // GUI

                // String Name=JOptionPane.showInputDialog("Enter Your Name: ");
                // int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: "));
                // double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your
                // Height: "));
                // JOptionPane.showMessageDialog(null,"Hello "+Name);
                // JOptionPane.showMessageDialog(null,"You are "+age+" years old");
                // JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");

                // Math
                // double x,y,z;
                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the side of x: ");
                // x=s.nextDouble();

                // System.out.println("Enter the side of y: ");
                // y=s.nextDouble();

                // z=Math.sqrt((x*x+y*y));
                // System.out.println("The hypotenuse is "+z);
                // s.close();

                // Random

                // Random r=new Random();
                // int x=r.nextInt(6)+1;
                // System.out.println(x);

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the number to find th day: ");
                // int n=s.nextInt();

                // switch(n)
                // {
                // case 1:
                // System.out.println("Monday");
                // break;
                // case 2:
                // System.out.println("Tuesday");
                // break;
                // case 3:
                // System.out.println("Wednesday");
                // break;
                // case 4:
                // System.out.println("Thursday");
                // break;
                // case 5:
                // System.out.println("Friday");
                // break;
                // case 6:
                // System.out.println("Saturday");
                // break;
                // case 7:
                // System.out.println("Sunday");
                // break;
                // default:
                // System.out.println("Not a valid Day");
                // }

                // While loop
                // Scanner s=new Scanner(System.in);
                // String name="";
                // while(name.isBlank())
                // {
                // System.out.println("Enter your Name: ");
                // name=s.nextLine();
                // }
                // System.out.println("Your name is "+name);

                // do while loop
                // Scanner s=new Scanner(System.in);
                // String name="";
                // do{
                // System.out.println("Enter your name:");
                // name=s.nextLine();
                // }while(name.isBlank());
                // System.out.println("Your name is "+name);

                // int i=10;
                // while(i-->0)
                // {
                // System.out.print(i--+" ");

                // }

                // For loop

                // String name="Kumaravel";
                // int age=19;
                // String country="Tamilnadu";
                // String company="ZOHO";
                // String FormattedString=String.format("Hello My Name is %s.I am %d years old.I
                // am from %s.I work For %s.",name,age,country,company);
                // System.out.println(FormattedString);

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the first number: ");
                // int a=s.nextInt();
                // System.out.println("Enter the second number: ");
                // int b=s.nextInt();
                // char operator;
                // System.out.println("Enter the operations to be performed: +,-,*,/,%");
                // operator=s.next().charAt(0);
                // switch(operator)
                // {
                // case '+':
                // System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
                // break;

                // case '-':
                // System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b
                // ));
                // break;

                // case '*':
                // System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b
                // ));
                // break;

                // case '/':
                // System.out.println("Division of "+a+" and "+b+" is "+(a/b
                // ));
                // break;

                // default:
                // System.out.println("Invalid operation");
                // }

                // int n=5;
                // int sum=0;
                // int i=1;

                // do{
                // System.out.println(i);
                // sum+=i;
                // i++;
                // }while(i<=n);
                // System.out.println("Sum of first "+n+" natural numbers is "+sum);

                // Type casting

                // Widening Casting -- converting smaller datatype into larger.
                // byte -> short -> char -> int -> long -> float →> double.

                // int a=10;
                // double b=a;
                // System.out.println("Value of a is "+a);
                // System.out.println("Value of b is "+b);

                // Narrowing Casting -- converting larger datatype into smaller.
                // double →> float →> long →> int →› char →> short →> byte.

                // int a=10;
                // double b=45.666;
                // int c=(int)b;
                // System.out.println("Value of a is "+a);
                // System.out.println("Value of c is "+c);

                // nested if

                /*
                 * A company insures its drivers in the following cases:
                 * a. If the driver is married.
                 * b. If the driver is unmarried, male & above 30 years of age.
                 * c. If the driver is unmarried, female & above 25 years of age.
                 */

                // Scanner s = new Scanner(System.in);
                // System.out.println("Enter the maritial status M/U: ");
                // char maritial=s.next().charAt(0);
                // {

                // if(maritial=='u' || maritial=='U')
                // {
                // System.out.println("Enter the Gender M/F: ");
                // char gender=s.next().charAt(0);
                // System.out.println("Enter the Age: ");
                // int age=s.nextInt();
                // if((gender=='m' || maritial=='M')&& age>=30)
                // {
                // System.out.println("You are eligible for Inurance");
                // }
                // else if((gender=='f' || maritial=='F')&& age>=25)
                // {
                // System.out.println("You are eligible for Inurance");
                // }
                // else{
                // System.out.println("You are not eligible for Inurance");
                // }
                // }
                // else if(maritial=='m' || maritial=='M')
                // {
                // System.out.println("You are eligible for Inurance");
                // }
                // else{
                // System.out.println("Invalid output");
                // }
                // }

                // Enhanced For loop

                // int numbers[]={10,20,30,40,50,60,70};
                // for(int n:numbers)
                // {
                // System.out.print(n+" ");
                // }

                // nested for loop

                // triangle pattern

                // for(int i=1;i<=5;i++)
                // {
                // for(int j=1;j<=i;j++)
                // {
                // System.out.print("*");
                // }
                // System.out.println("");
                // }

                // Square pattern

                // for(int i=1;i<=5;i++)
                // {
                // for(int j=1;j<=10;j++)
                // {
                // System.out.print("*");
                // }
                // System.out.println("");
                // }

                // WAJP to find factorial of the given number.

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the number: ");
                // int n=s.nextInt();
                // int f=1;
                // for(int i=1;i<=n;i++)
                // {
                // f=f*i;
                // }
                // System.out.println("Factorial of "+n+" is: "+f);

                // WAJP to find the sum and average of the given number.

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the limit: ");
                // int n=s.nextInt();
                // int sum=0;
                // int average;
                // int i=1;
                // for(i=1;i<=n;i++)
                // {
                // System.out.println("Enter the number: ");
                // average=s.nextInt();
                // sum+=i;
                // }
                // System.out.println("The value of "+n+" is "+sum);
                // System.out.println("The average of "+n+" is "+sum/n);

                // swap two numbers

                // int a,b,temp;
                // a=10;
                // b=20;
                // temp=a;
                // a=b;
                // b=temp;
                // System.out.println(a);
                // System.out.println(b);

                // Fibonacci series

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the number: ");
                // int n=s.nextInt();
                // int a=-1,b=1,c;
                // for(int i=1;i<=n;i++)
                // {
                // c=a+b;
                // System.out.println(c);
                // a=b;
                // b=c;
                // }

                // reverse of n digit number

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the number: ");
                // int n=s.nextInt();
                // int reverse=0,rem;
                // while(n!=0)
                // {
                // rem=n%10;
                // reverse=(reverse*10)+rem;
                // n=n/10;
                // }
                // System.out.println("The reverse of the number is: "+reverse);

                // check whether the given three number is Amstrong or not

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the three digit number: ");
                // int number=s.nextInt();
                // int digit1,digit2,digit3;
                // int temp=number;
                // digit3=temp%10;
                // temp=temp/10;
                // digit2=temp%10;
                // temp=temp/10;
                // digit1=temp%10;
                // int result=
                // (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
                // if(number==result)
                // {
                // System.out.println(number+" is an Amstrong number");
                // }
                // else
                // {
                // System.out.println(number+" is not an Amstrong number");
                // }

                // WAJP to find the amstrong number from 100-999

                // int digit1,digit2,digit3,result,temp;
                // for(int number=100;number<=999;number++)
                // {
                // temp=number;
                // digit3=temp%10;
                // temp=temp/10;
                // digit2=temp%10;
                // temp=temp/10;
                // digit1=temp%10;
                // result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
                // if(number==result)
                // {
                // System.out.println(number+" is an Amstrong number");
                // }
                // }

                // print multiplication tables

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the Tables: ");
                // int table=s.nextInt();
                // System.out.println("Enter the limit: ");
                // int limit=s.nextInt();
                // for(int i=1;i<=limit;i++)
                // {
                // System.out.println(table+"*"+i+"="+table*i);
                // }

                // factor of the given number

                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value: ");
                // int n=s.nextInt();
                // int count=0,i;
                // for(i=1;i<=n;i++)
                // {
                // if(n%i==0)
                // {
                // count++;
                // }
                // }
                // System.out.println("The factors of the given number "+n+" is "+count);

                // Prime number or not
                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the value: ");
                // int n=s.nextInt();
                // int count=0,i;
                // for(i=1;i<=n;i++)
                // {
                // if(n%i==0)
                // {
                // count++;
                // }
                // }
                // if(count==2)
                // {
                // System.out.println(n+" is a prime number");
                // }
                // else
                // {
                // System.out.println(n+" is not a prime number");
                // }

                // prime number between 1-999

                // int count=0;
                // for(int i=1;i<=20;i++)
                // {
                // for(int j=1;j<=i;j++)
                // {
                // if(i%j==0)
                // {
                // count++;
                // }
                // }
                // if(count==2)
                // {
                // System.out.println(i+" is a prime number");
                // }
                // count=0;
                // }

                // reverse a String

                // Scanner s=new Scanner(System.in);
                // System.out.print("Enter the String: ");
                // String str=s.nextLine();
                // String rev="";
                // for(int i=str.length()-1;i>=0;i--)
                // {
                // rev+=str.charAt(i);
                // }
                // System.out.println("The reversed String is: "+rev);
                // //palindrome

                // if(str.equalsIgnoreCase(rev))
                // {
                // System.out.println(rev+" is a palindrome");
                // }
                // else
                // {
                // System.out.println(rev+" is not a palindrome");
                // }

                // perfect number

                // Scanner s=new Scanner(System.in);
                // System.out.print("Enter the number: ");
                // int n=s.nextInt();
                // int sum=0;
                // for(int i=1;i<n;i++)
                // {
                // if(n%i==0)
                // {
                // sum+=i;
                // }
                // }
                // if(sum==n)
                // {
                // System.out.println(n+" is a perfect number");
                // }
                // else
                // {
                // System.out.println(n+" is not a perfect number");
                // }

                // strong number

                // Scanner s=new Scanner(System.in);
                // System.out.print("Enter the number: ");
                // int n=s.nextInt();
                // int originalnumber=n,rem;
                // int i;
                // while(n>0)
                // {
                // rem=n%10;
                // System.out.println("remainder: "+rem);
                // int fact=1;
                // for( i=1;i<=rem;i++)
                // {

                // fact*=i;
                // }
                // System.out.println("fact: "+fact);
                // n=n/10;
                // }

                // Array

                // int number[]={10,20,30,40,50,60};
                // for(int n:number)
                // {
                // System.out.print(n+" ");
                // }

                // single dimension array

                // int a[]=new int[10];
                // for(int i=0;i<3;i++)
                // {
                // Scanner s=new Scanner(System.in);
                // System.out.print("Enter the number: ");
                // a[i]=s.nextInt();
                // System.out.println(a[i]+" ");
                // }

                // for(int c:a)
                // {
                // System.out.print(c+" ");
                // }

                // WAJP to count an odd or even number in an array

                // int even=0,odd=0;
                // Scanner s=new Scanner(System.in);
                // System.out.println("Enter the limit: ");
                // int n=s.nextInt();
                // int a[]=new int[n];
                // for(int i=0;i<n;i++)
                // {
                // System.out.println("Enter a["+i+"] value : ");
                // a[i]=s.nextInt();
                // }
                // for(int element:a)
                // {
                // if(element%2==0)
                // {
                // even++;
                // }
                // else
                // {
                // odd++;
                // }
                // }
                // System.out.println("total number of even: "+even);
                // System.out.println("total number of odd: "+odd);

                // reverse an array

                 int a[]={2,5,1,4,7,8,3,98,67,56,34};
                 System.out.println("Before sort: "+Arrays.toString(a));
                 int temp;
                 for(int i=0;i<a.length;i++)
                 {
                 for(int j=i+1;j<a.length;j++)
                 {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 }
                 }
                 System.out.println("After sort: "+Arrays.toString(a));

        }
}
