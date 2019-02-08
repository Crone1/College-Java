import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        // Read in the number ... 
        int num = in.nextInt();
        // ... and the string
        String word = in.next();

        int i = 0;
        while (i < num)
        {
            System.out.print(word);
            i = i + 1;
        }
        System.out.println();
    }
}
