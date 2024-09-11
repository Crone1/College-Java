import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");
        
        // Read in the numbers (you need a nextInt for each integer)
        int x = in.nextInt();
        int y = in.nextInt();
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int result = x + y;
        
        // prepare the user for the result
        // print out the result (use System.out.println() )
        System.out.println(x + " and " + y + " is " + result);
        
    }
}
