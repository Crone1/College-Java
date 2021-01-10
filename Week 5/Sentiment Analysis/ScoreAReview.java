import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class ScoreAReview
{
    static boolean containsWord(String word, String reviewText)
    {
        String [] words = reviewText.split(" ");// want to split the review into words.
    
        for(String w : words)
            if(word.equalsIgnoreCase(w)) // is the word there ...
            {
                return true; // ... yes => tell the caller
            }

          return false; // Went through every word ... no match
    }

    public static double sentiment(String review, String reviewFilename)
    {
        try
        {
            String[] words = review.split(" ");
            int [] words_scores = new int[words.length];
            
            int num_word_scores = 0;

            for(int j = 0; j < words.length; j++)
            {
                String word = words[j];
                Scanner input2 = new Scanner(new File(reviewFilename));

                String line;
                int [] scores = new int[1000];

                int count = 0;

                do
                {
                    line = input2.nextLine();
                    //System.out.println(line);
                    
                    if (containsWord(word, line))
                    {
                        String[] parts = line.split(" ");
                        scores[count] = Integer.parseInt(parts[0]);
                        count++;
                    }
                }
                while (input2.hasNext());

                int tot = 0;
                for(int l = 0; l < count; l++)
                {
                    tot = tot + scores[l];
                }

                if (count != 0)
                {
                    double c = count;
                    double t = tot;
                    //System.out.println("count = " + count);
                    //System.out.println("tot = " + tot);
                    
                    words_scores[j] = tot/count;
                    num_word_scores += count;
                }

                else
                {
                    words_scores[j] = 0;
                }
            }
            
            int tot_score = 0;
            for (int n = 0; n < words_scores.length; n++)
            {
                tot_score += words_scores[n];
                //System.out.println(words_scores[n]);
            }
            
            double ts = tot_score;
            double wsl = num_word_scores;
            
            //System.out.println(ts);
            //System.out.println(wsl);
            if (tot_score != 0)
            {
                return ts/wsl;
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Frog");
        }
        return -1;
   }
}
