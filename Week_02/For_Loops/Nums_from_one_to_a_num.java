import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        
        double num = in.nextDouble();
 
        int i;
        for(i = 1; i < num + 1; i = i + 1)
            System.out.print(i + " ");
            
        System.out.println();
    }
}
