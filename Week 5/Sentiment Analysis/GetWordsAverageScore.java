import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class GetWordsAverageScore
{
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    
    public static void main(String [] args)
    {
        try
        {
            String word = args[0];
            String filename = args[1];

            Scanner input = new Scanner(new File(filename));

            String line;
            int [] scores = new int[1000];
            
            int count = 0;
            do
            {
                line = input.nextLine();
                
                String[] parts = line.split(" ");
                int score = Integer.parseInt(parts[0]);
                for (int i = 1; i < parts.length; i ++)
                {
                    if (parts[i].length() - word.length() >= 0)
                    {
                        if (parts[i].substring(parts[i].length()-word.length(), parts[i].length()).equals(word))
                        {
                            scores[count] = score;
                            count++;
                        }
                        else
                        {
                            int k = 0;
                            while (k + word.length() < parts[i].length())
                            {
                                if (parts[i].substring(k, k + word.length()).equals(word))
                                {
                                   scores[count] = score;
                                   count++;
                                }
                                 k = k + 1;
                            }
                        }
                    }
                }
            }
            while (input.hasNext());
            
            int tot = 0;
            for(int l = 0; l < count; l++)
            {
                tot = tot + scores[l];
            }
            System.out.println(word + " appears " + count + " times.");
            if (count != 0)
            {
                double c = count;
                double t = tot;
                System.out.println("The average score of the reviews containing " + word + " is " + df2.format(t/c));
            }
            else
            {
                System.out.println("The average score of the reviews containing " + word + " is 0.00");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Exception!");
        }
   }
}
