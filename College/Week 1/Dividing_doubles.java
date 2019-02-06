import java.util.Scanner;

public class DoubleDivision
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        double x = in.nextDouble();
        double y = in.nextDouble();
        double result = x / y;
        System.out.println("Please enter two floating point numbers: " + x +  " / " + y + " is " + result); 
    }
}
