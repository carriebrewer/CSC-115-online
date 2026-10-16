// Carrie Brewer
// 10-16-26
// Making random integers using the Random class

// We are going to use a premade Java class: Random
import java.util.Random;


public class RandomInts {
    public static void main(String[] args) {
        makeRandoms(); // method for making and printing random integers
    }

    // This method looks at making random integers.
    public static void makeRandoms() {

        // HOW TO MAKE RANDOM INTEGERS USING THE RANDOM CLASS:

        // Step 1: Instantiate (create) a Random object (variable)
        // (make an instance of the Random class)
        // Note: This is NOT the random integer, but what we will use
        // to get the random integer

        Random rand = new Random();

        // Step 2: Use the .nextInt(int) method to generate
        // a random integer in the range 0 to int - 1
        // (exclusive of int)

        int randomInt = rand.nextInt(100); // gives an int 0 - 99
        System.out.println(randomInt);

        // How to get a random integer between 1 and 100?
        // another version of .nextInt():  .nextInt(start, end)
        // gives an int between start and end - 1
        // (exclusive of end)

        int randomInt2 = rand.nextInt(1, 101); // gives an int 1 - 100
        System.out.println(randomInt2);

        // How to get a random integer between 10 and 20?
        int randomInt3 = rand.nextInt(10, 21); // gives an int 10 - 20
        System.out.println(randomInt3);

        // Live code demo in Brightspace

       
    }
    
}
