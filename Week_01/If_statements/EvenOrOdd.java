import java.util.Scanner;

public class EvenOdd
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " is even.");
        else
            System.out.println(x + " is odd.");
    }   
}
