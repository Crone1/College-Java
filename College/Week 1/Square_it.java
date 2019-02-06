import java.util.Scanner;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read in the number (use in.nextInt() and assign it to an integer
        int x = in.nextInt();
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int result = x * x;
        
        // prepare the user for the result
        // print out the result (use System.out.println()
        System.out.print(x + " squared is ");
        System.out.println(result);
        
    }
}
