import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
    
    int i = 0;
    while (i < (word.length() - 1))
        {
            System.out.println(word.substring(i, (i+2)));
            i = i + 1;
        }
            
    }
}
