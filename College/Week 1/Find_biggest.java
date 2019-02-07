import java.util.Scanner;

public class Bigger
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y)
            System.out.println(x + " is the biggest.");
        else
            System.out.println(y + " is the biggest.");
    }   
}
