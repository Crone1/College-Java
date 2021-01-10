import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        int i = 0;
        while (i + 2 <= word.length())
        {
            if (word.substring(i, (i+2)).equals("hi"))
                System.out.println(word.substring(i, (i+2)));
            i = i + 1;
            
        }
        
    }
}
