import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MapOfPhoneNumbers
{
    public static void main(String [] args)
    {
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        while ((line != "!!") && (in.hasNextLine()))
        {   
            
            String[] tokens = line.trim().split("\\s+");
            if ((tokens.length > 1) && !(tokens[1].equals("?") ))
            {
                int num = Integer.parseInt(tokens[1]);
                map.put(tokens[0],  num);
            }
            else if ((tokens.length > 1) && !(map.containsKey(tokens[0])))
            {
                System.out.println("Sorry, there is no " + tokens[0]);
            }            
            else if ((tokens.length > 1) && (tokens[1].equals("?") ))
            {
                int p_number = (Integer) map.get(tokens[0]);
                System.out.println(tokens[0] + " has number " + p_number);
            }

            line = in.nextLine();
        }
        System.out.println("Bye");
    }
}
