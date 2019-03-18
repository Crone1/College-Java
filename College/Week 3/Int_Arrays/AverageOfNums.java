import java.util.Scanner;

public class AverageOfNums
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");
        
        double sum = 0;
        int i = 0;
        while (i < num)
        {
            sum = sum + in.nextDouble();
            i++;
        }

         double average = (sum/num);
        System.out.println("The average is " + average);
    }
}
