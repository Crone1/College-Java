import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNamesFromFileAndArgs
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Enter the file name: ");
        try
        {
            String filename = args[0];

            try
            {
                    Scanner input = new Scanner(new File(filename));
                
                    int length = input.nextInt();
                    String [] names =  new String[length];
                    
                    for (int i = 0; i < length; i++)
                    {
                        names[i] = input.next();
                    }
                    
                    System.out.println("The names in reverse order are: ");
                    
                    for(int counter = names.length - 1; counter >= 0; counter--)
                    {
                        System.out.print(names[counter] + " ");
                    }
            }
            catch(FileNotFoundException e)
            {
                System.out.print("Frog");
            
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Usage: java ReadNames <filename>");
        }
    }
}
