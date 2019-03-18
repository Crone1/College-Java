import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class PrintSeen
{
    public static void main(String [] args)
    {   
        System.out.println("Enter some numbers (-1 to end)");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Previous:");
        while (num != -1)
        {   
            if (! numbers.contains(num))
            {
            numbers.add(num);
            }
            else
            {
                System.out.println(num);
            }
            num = in.nextInt();
        }
        
    }
}
