import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
    
        int num = in.nextInt();
        int count = 0;
        while (num != -1)
            {
            count = count + 1;
            num = in.nextInt();
            }
        
        System.out.println(count + " numbers were entered.");
    }
}
