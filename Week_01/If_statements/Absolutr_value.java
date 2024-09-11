import java.util.Scanner;

public class Absolute
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        if (x <= 0)
            System.out.println("The absolute value is " + (x * -1) + '.');
        else
            System.out.println("The absolute value is " + x + '.');
    }  
}
