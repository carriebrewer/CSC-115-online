// Carrie Brewer
// 9-1-26
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Escapes {
    public static void main(String[] args) {
        escapes(); // in this method we will explore output and escape sequences
    }

    // A method to investigate output and escape sequences
    public static void escapes() {

        // print vs. println
        System.out.print("Hello Class!"); // next thing prints on the same line
        System.out.println("It is Tuesday."); // next thing prints on the next line
        System.out.println("Happy September!");
        System.out.println();  // print a new line / blank line

        // Output
        System.out.println(2);  // you can put text or numbers in a print statement

        System.out.println(1 + 2 * 3);  // you can even do math! (order of ops)

        // Escape Sequences: special characters denoted with \ (the escape character)

        // \n -> new line
        System.out.println("Hello \n\n\n");
        System.out.println("H\nello");
        System.out.println();

        // \t -> tab
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\tHi");
        System.out.println();

        // \" -> "
        System.out.println("She said \"Java is the best language!\""); 

        // You try!

        // Think of a quote or a saying that you know. 
        // Create a new class called PrintQuote.java.
        // Output your saying with visible quotation marks in the output.

        // ex. Output: "That's the way the cookie crumbles."






    }


    
    
}
