import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
    
        int num = in.nextInt();
        int pen = 0;
        while (num != -1)
            {
            pen = num;
            num = in.nextInt();
            }
        
        System.out.println("The penultimate number was: " + pen);
    }
}
