import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        System.out.print("Enter a number: ");
        
        int i = num;
        
        while (i < 21)
        {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
    }
}
