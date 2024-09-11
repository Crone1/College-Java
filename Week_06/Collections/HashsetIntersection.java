import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class HashsetIntersection
{
    public static void main(String [] args)
    {
        Set<String> hash_dels = new HashSet<String>();
        
        Set<String> hash_studs = new HashSet<String>();
        
        try
        {
            Scanner in = new Scanner(System.in);
            
            Scanner dels = new Scanner(new File(args[0]));
            
            Scanner studs = new Scanner(new File(args[1]));
            
            while (dels.hasNextLine())
            {
                String delinquent = dels.nextLine();
                //System.out.println("Del = " + delinquent);
                hash_dels.add(delinquent);
            }
            
            while (studs.hasNextLine())
            {
                String student = studs.nextLine();
                //System.out.println("stud = "+ student);
                hash_studs.add(student);
            }
            
            hash_studs.retainAll(hash_dels);
            
            int i = 1;
            for (String s : hash_studs)
            {
                System.out.println(i + ". " + s);
                i ++;
            }
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println("The file does not exist");
        }
    }
}
