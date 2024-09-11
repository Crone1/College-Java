import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        // count how many times "hi" occurs.
        int i = 0;
        int count = 0;
        while (i + 2 <= phrase.length())
        {
            if (phrase.substring(i, (i+2)).equals("hi"))
                count++;
                
            i = i + 1;
        }
        System.out.println(count);
    }
}
