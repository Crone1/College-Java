import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        int i = 0;
        while (i + 1 <= line1.length())
        {
            if (line1.substring(i, i + 1).equals(line2.substring(i, i + 1)))
            {
                numMatching = numMatching + 1;
            }
            i = i + 1;
        }
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}
