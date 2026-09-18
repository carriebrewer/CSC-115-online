// Carrie Brewer
// 9-18-26
// Notes on if/else statements

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        ifMethod(); // exploring if and else statements
    }

    // A method to study if/else statements
    public static void ifMethod() {

        // Task: ask the user for a number and tell them if it's even

        Scanner sc = new Scanner(System.in);  // make a Scanner that reads from keyboard

        System.out.println("Enter a number:"); //prompt the user for a number
        int number = sc.nextInt(); // read and store the number

        // How to test for even-ness? --> divisible by 2 (use %)

        // Three common mistakes:
        // 1. DON'T put a ';' after the if()
        // 2. DO put curly braces { } around the code to be executed if true
        // 3. DO remember to test for equality with '=='

        // test for evenness using mod (%)
        if(number % 2 == 0) {
            System.out.println(number + " is even");
            System.out.println("w00t!");
        }

        System.out.println("The end.");  // prints every time


        // Task: compare two numbers
        // Possible results: num1 less than num2 or num1 greater than num2

        int num1 = 12;
        int num2 = 7;

        // compare two numbers and output message

        if(num1 < num2) {
            System.out.println("num1 is less!");
        } else {
            System.out.println("num1 is NOT less!");  // why not num2 is less? equal???
        }

        // Note: Okay to have if with no else. NOT okay to have empty if()
        // (write the question so that there is code in the if())

        // Also: exception allowed for no { } around a single line of code
        // (dangerous: I do not recommend!)

        sc.close();




    }

}
