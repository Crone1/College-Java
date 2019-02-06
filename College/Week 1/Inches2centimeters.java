import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        // Find out how many inches (use a whole number for integers)
        // System.out.print("Please enter a quantity in inches:");
        double inches = in.nextInt();
        // Print out the result
        double result = inches * 2.54;
        int frog = (int) inches;
        System.out.println(frog + " inch is " + result + "cm");
    }
}
