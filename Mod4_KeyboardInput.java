// Carrie Brewer
// 9-14-26
// How to use a Scanner to read user input from the keyboard

// To read from the keyboard, we use the premade Scanner class in Java
// Certain premade classes need to be imported to be used
// String and Math: no import
// Scanner: need to import 

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {

        readInput(); // reading input from the keyboard
    }

    // A method that will look at reading input from the keyboard
    public static void readInput() {

        String name;
        int age;

        // INSTANIATE (create) a Scanner that reads from the keyboard
        // This makes a Scanner called 'sc'

        Scanner sc = new Scanner(System.in);
        //  Why ^sc?  Could have named it anything...
        // Descriptive variable names are helpful

        // Prompt the user for information
        // use the .nextLine() method to read and store text

        System.out.println("What is your full name?");
        name = sc.nextLine();  // reads in the line of text and stores it

        // Scanners have methods to read in the next piece of data
        // read until there is a space or a new line
        // To read and store an int, use .nextInt()

        System.out.println("What is your age?");
        age = sc.nextInt();

        // Echo [concatenation]
        System.out.println("Hello, " + name + ". How does it feel to be " + age + "?");

        sc.close();  // close the Scanner (makes the compiler happy)


    }

   
    
}
