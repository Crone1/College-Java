import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        int i = 1;
        
        while (i < (num + 1))
        {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
    }
}
