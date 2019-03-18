import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        int [] nums = new int[num];
        System.out.print("Enter " + num + " numbers: ");

        // Read in the numbers
        int i;
        for (i = 0; i < num; i = i + 1)
            {
                nums[i] = in.nextInt();
            }

        System.out.print("The numbers reversed are:");

        int j;
        for(j = num - 1; j >= 0; j--)
        {
            System.out.print(" " + nums[j]);
        }
        
    System.out.println();
    }
}
