import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();

        int i;
        for(i = num; i < 20 + 1; i = i + 1)
            System.out.print(i + " ");
            
        System.out.println();
    }
}
