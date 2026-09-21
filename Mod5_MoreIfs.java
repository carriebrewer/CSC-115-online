// Carrie Brewer
// 9-21-26
// Efficiently using if/else statements and multiple conditionals (selections)

import java.util.Scanner;

public class MoreIfs { 
    public static void main(String[] args) {
        betterIfs(); // efficiently using if/else statements
        multipleIfs();  // a look at ways to handle multiple conditionals

    }

    // This method shows the preferred way to handle code that is being reused
    public static void betterIfs() {

        // When you have code that ends up being reused in your program

        // Preferred way:

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if(age >= 65) {
             System.out.println("Age is just a number!");
        }

        System.out.println(age + " is a good age.");


        /* less preferred way:

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }

        if(age < 65) {
            System.out.println(age + " is a good age.");
        }

        */


    }

    // This method looks at ways to do multiple conditionals/selections
    // and Boolean logic
    public static void multipleIfs() {
        
        // let's compare two numbers (num and 10) in a better way than we 
        // did before

        // multiple ways to handle multiple conditionals/selections

        // Only one outcome possible: NESTED
        // indentation: every { --> next line indented

        int num = 2;
        if(num > 10) {
            System.out.println("num is greater than 10!");
        } else {
            if(num < 10) {
                System.out.println("num is less than 10!");
            } else {
                System.out.println("num is equal to 10!");
            }
        }

        // Only one outcome possible: NEATER/CLEANER NESTING --> else if

        if(num > 10) {
            System.out.println("num is greater than 10!");
        } else if(num < 10) {
            System.out.println("num is less than 10!");
        } else {
            System.out.println("num is equal to 10!");
        }

        // More than one outcome possible: NOT NESTED (STACKED)

        num = 101;
        if(num > 10) {
            System.out.println("num is greater than 10!");
        }
        if(num > 100) {
            System.out.println("num is a really big number!");
        }

        // BOOLEAN LOGIC
        num = 42;

        // boolean logic operator AND --> short-circuit
        if(num >= 40 && num <= 60) {
            System.out.println("num is in range 40-60");
        }

        // boolean logic operator OR --> short-circuit
        if(num >= 40 || num <= 10) {
            System.out.println("num is valid!");
        }

    }



}
