import java.util.Scanner;

public class LastLetter
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        
        int len = name.length();
        System.out.println("The last letter of your name is " + name.substring(len-1) + '.');
        
        // Use the substring() method of the String class.
    }
}
