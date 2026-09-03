// Carrie Brewer
// 9-3-26
// Notes about variables and String output

public class Variables {
    public static void main(String[] args) {

        variables(); // a method to investigate variables
        aboutStrings(); // a method to investigate Strings
    }

    // In this method, we will look at variables.
    public static void variables() {
        /*
            A variable is a place to store a value.
            A variable holds data.
            A variable is a named location in the computer's memory.

            There are a few different types of information we can store:

            integer(whole numbers):     int
            decimal(3.14, -6.023):      double
            boolean(true, false):       boolean
            character('a', '3', '?'):   char

            Other less common types: long, short, float, byte

            ALL PRIMITIVE DATA TYPES          
        
        */

        // When you want to use a variable: declare
        // DECLARE a variable named 'age' that holds a whole number (integer)
        // Note: variable names (and method names) start with a lowercase letter and follow camelCase
        // class names start with an uppercase letter and follow CamelCase

        int age;

        // When you want to give your variable a value: assign using =
        // ASSIGN the variable 'age' to the value of 44

        age = 44;

        // You can do both at once! (declare and assign)
        // DECLARE a variable named 'gpa' that holds a decimal
        // and ASSIGN it a value at the same time

        double gpa = 3.14;

        // Display the current value of your variables
        System.out.println("Your age is " + age + ".");
        System.out.println("Your gpa is " + gpa + ".");

        // Reassign the value of gpa
        gpa = 2.718;
        System.out.println("Your gpa is now " + gpa + ".");

        // In general:
        // type        name     =     value
        // int         num      =       28

        // Another example: 

        int num1 = 4;
        int num2 = 5;

        // You can do stuff with variables: print, math
        int sum = num1 + num2;
        System.out.println(sum);

        // One more thing

        int x;    // x has been DECLARED, but it has not been ASSIGNED
                  // (needs to be initialized)

        //System.out.println(x);  // error!

        // You try:
        // 1. Create a new class or add to your PrintQuote.java
        // 2. Declare 2 int variables and assign them values
        // 3. Display the sum
        // 4. Display the product 


    }


    // In this method we will look at Strings
    public static void aboutStrings() {

        // STRING:
        // a String is a variable that can hold a bunch of characters
        // (like a word)
        // String is a class (note the uppercase S) but we can use it like a primitive
        
        String firstName = "Carrie";  // note the camelCase
        System.out.println(firstName);
        System.out.println(firstName + " " + "Brewer");  // CONCATENATE

        // Mixing Strings and numbers is a tricky business
        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println("3 + 4 = " + 3 + 4);  // concatenates the numbers
                                                // onto the String (34 - oops!)

        System.out.println("3 + 4 = " + (3 + 4));  // using () helps
                                                   // (order of operations)

        System.out.println(3 - 4);
        //System.out.println("3 - 4 = " + 3 - 4); // error! doens't know how to 
                                                // handle - (syntax)

        System.out.println("3 - 4 = " + (3 - 4));  //fix with () (order of ops)

        int difference = 3 - 4;
        System.out.println("3 - 4 = " + difference);
                                               



    }
}
