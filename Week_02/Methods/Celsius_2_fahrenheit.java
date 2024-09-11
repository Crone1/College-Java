import java.util.Scanner;

public class Temp
{
    public static void main(String [] args)
    {
        System.out.println("Give me a Fahrenheit temperature: ");
        Scanner in = new Scanner(System.in);

        double num = in.nextDouble();
        
        double result = Convert.fahr2cels(num);
        
        System.out.println("In Celsius that would be: " + result);
    }
}
