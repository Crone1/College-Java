import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadStudentsIntoArray
{
   public static void main(String [] args)
   {

       try
       {
            String filename = args[0];
            
            Scanner input = new Scanner(new File(filename));
                    
            int length = input.nextInt();
            Student [] studs =  new Student[length];
            
            int j = 0;
            for (int i = 0; i < (length * 2) - 1; i = i + 2)
            {   
                String name = input.next();
                    
                String mark = input.next();
                    
                studs[j] = new Student(name, Integer.parseInt(mark));
                j = j + 1;
            }
        
            Student.print(studs);
            
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Frog");
        
        }
   }
}
