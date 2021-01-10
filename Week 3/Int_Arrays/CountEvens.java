public class CountEvens
{
    public static int countEven(int [] array)
    {
        int i;
        int total = 0;
        for (i = 0; i < array.length; i = i + 1)
        {
            if (array[i] % 2 == 0)
            {
            total = total + 1;
            }
        }
        return total;
    }
}
