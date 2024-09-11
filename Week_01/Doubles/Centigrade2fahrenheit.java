import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        // Find out how many inches (use a whole number for integers)
        // System.out.print("Please enter a quantity in inches:");
        double cent = in.nextInt();
        // Print out the result
        double result = (cent * 1.8) + 32;
        int frog = (int) cent;
        System.out.println(frog + " " + result);
    }
}
