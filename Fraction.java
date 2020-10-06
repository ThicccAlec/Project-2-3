import java.util.Scanner;
/**
 * The code that puts your numbers into fraction form
 *
 * Bradley
 * 10/5/2020
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;
    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fra()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numerator");
        int numerator = input.nextInt();
        System.out.print("Enter a denominator");
        int denominator = input.nextInt();
        System.out.print(numerator + "/" + denominator);
    }
}
