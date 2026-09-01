// Carrie Brewer
// 9-1-26
// Chapter 2 Notes: Comments

public class Ch2Comments {
    public static void main(String[] args) {
        comments(); // in this method we will explore comments
    }

    // A method to investigate comments
    public static void comments() {
        // anything you write in a comment is NOT read by the compiler 

        // We use comments for:
        // -Documenting your name on the program as the author
        // -Documenting a brief description of the program
        // -As you go along, making notes to explain to yourself and other what your code should do

        // Also: DEBUGGING 
        // If there is code tht doesn't work quite yet
        // ex. You can isolate a bunch of lines that aren't working and comment them out instead of deleting them

        // Also: GIVING CREDIT
        // If your code came from another source (ex. GitHub, AI), use comments to cite/give credit
        // ex. Code source: https://github.com/awecomecoder


        // How do we make comments?

        // Line comments: anything after the // is ignored by the compiler

        // Block comment: /* */ (slash star star slash) (comment sandwich)

        // Java Doc comment: /** */ (will automatically generate code documentation)

        // EXAMPLES

        /*
            When you have mulitple lines of comments.
            it's helpful to do a block comment because
            you can add as many lines as you want.
            Good for program heading comment with name/description at top.        
        
        */

        // DEBUGGING
        System.out.println("Hello World!");
        //System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        //System.out.println("Hello World!");
        System.out.println("Hello World!");

        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        */

        // PRO-TIP: DO NOT WAIT until the end to do your comments! :)




    }
    
}
