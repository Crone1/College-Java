import java.util.Scanner;

public class AboveAverageNums
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] nums = new double[num];
        System.out.print("Enter " + num + " numbers: ");

        // Read in the numbers
        int i;
        double total = 0;
        for (i = 0; i < num; i = i + 1)
            {
                nums[i] = in.nextDouble();
                total = total + nums[i];
            }

        double average = total/num;

        System.out.println("The above average numbers are:");

        // Print out the numbers greater than the average
        int j;
        for(j = 0; j < num; j++)
        {
            if (nums[j] > average)
            {
            System.out.print(" " + nums[j]);
            }
        }

        System.out.println(); // Finish with a new line
    }
}
