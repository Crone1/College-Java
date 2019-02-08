import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
                
        int count = 0;
        int i;
        
        for(i= 1; i <= num; i = i + 1)
            count = count + i;
            
        System.out.println("The sum of the numbers from 1 to " + num + " is " + count);
    }
}
