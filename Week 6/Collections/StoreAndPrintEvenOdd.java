import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreAndPrintEvenOdd
{
    public static void main(String [] args)
    {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    
        while (num != -1)
        {
            if (num % 2 == 0)
            {
                evens.add(num);
            }
            else
            {
                odds.add(num);
            }
            
            num = in.nextInt();
        }
        System.out.print("Odd: ");
        for(int n: odds)
        {
            System.out.print(n + " ");
        }
        System.out.println();
        
        System.out.print("Even: ");
        for(int n: evens)
        {
            System.out.print(n + " ");
        }
    }
}
