// Carrie Brewer
// 10-19-26
// Experimenting with seeding the random number generator and
// generating random characters (chars)

import java.util.Scanner;
import java.util.Random;


public class RandomSeed {
    public static void main(String[] args) {
        makeRandoms(); // make random things using a seed from the user
    }

    // This method asks the user for a seed for the random number generator
    // and then generates random integers and chars
    public static void makeRandoms() {

        // Seed the random number generator with a value from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a seed value:");
        int seed = sc.nextInt();

        Random rand = new Random(seed);  // use the seed the user entered

        int rand1 = rand.nextInt(100); // 0 - 99
        System.out.println("Random Number 1 = " + rand1);  
       

        // between 10 - 50
        int rand2 = rand.nextInt(10, 51); 
        System.out.println("Random Number 2 = " + rand2);  

        // Random chars (characters) --> ASCII Values/Table
        // Random uppercase letters: int value 65 - 90
        // need to cast to a char

        int rand3 = rand.nextInt(65, 91);
        System.out.println("Random Number 3 = " + rand3); 
        char randomChar = (char)rand3;
        System.out.println("Random Character = " + randomChar);
    }
}
