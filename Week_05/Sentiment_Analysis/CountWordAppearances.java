import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CountWordAppearances
{
    public static void main(String [] args)
    {
        try
        {
            String filename = args[1];
            
            String word = args[0];
            
            //System.out.println("word = " + word);
            
            Scanner input = new Scanner(new File(filename));
                   
            String line; 
            int count = 0;
            while (input.hasNext())
            {
                line = input.next();
                //System.out.println(line);
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i ++)
                {
                    if (parts[i].length() - word.length() >= 0)
                    {
                        if (parts[i].substring(parts[i].length()-word.length(), parts[i].length()).equals(word))
                        {
                            count ++;
                        }
                    }
                }
            }
            
            System.out.println(word + " appears " + count + " times.");
            
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Exception!");
        
        }
   }
}
