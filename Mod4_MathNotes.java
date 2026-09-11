// Carrie Brewer
// 9-11-26
// Notes on math, casting, constants (Ch. 3); Math, rounding (Ch. 4)

public class MathNotes {
    public static void main(String[] args) {
        doMath(); // a method for doing some math
    }

    // In this method, we will explore math things
    public static void doMath() {

        // Division
        System.out.println(5/2); // 2
        System.out.println(5.0/2); // 2.5

        int num1 = 60;
        int num2 = 50;

        System.out.println(num1/num2);  // exact?
        System.out.println(1.0*num1/num2); // works- introduce a DOUBLE LITERAL
        System.out.println((double)num1/num2);  // the right way: CASTING
        // casting is when you temporarily turn a variable into a different type
        // PEMDAS at work...
        System.out.println((double)(num1/num2));  // nope- cast is too late

        // casting TRUNCATES (doesn't round)
        
        double pay = 500.92;
        System.out.println((int)pay); // 500 or 501? 500!

        pay = 99.999999999999;
        System.out.println((int)pay);  // 99

        // What if we want to round?
        // Math: a premade Java class (like String)
        // many useful method that do various math things
        // access with Math.____
        // can send information (numbers or variables) in the ()

        // round: Math.round(double num)
        // returns (gives) a long - need to cast to an int
        // (we use ints instead of longs generally, and doubles instead of floats)

        int roundedPay = (int)Math.round(pay); // without cast: error (type mismatch)
        System.out.println(roundedPay); // 100

        // EXPONENTS (powers)
        // ex. num1 squared?
        // num1 * num1
        // OR use Math.pow(base, exponent) ** returns a double
        // computer does NOT understand ^ for exponents, or () for multiplication like calculator

        double squared = Math.pow(num1, 2);
        System.out.println(squared);  // 3600.0

        // CONSTANTS (constant variables)
        // a variable whose value is set once and cannot be changed
        // proper formatting: all caps, declare with keyword "final"

        final int NUMBER_OF_STUDENTS = 18; // snake_case

        double TAX_RATE = 0.08;  // not totally correct...

        // Math class -> built in constants
        System.out.println(Math.PI);

    }

}
