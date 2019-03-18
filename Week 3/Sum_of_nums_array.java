public class Test
{
    public static int getSum(int [] array)
    {
        int i;
        int total = 0;
        for (i = 0; i < array.length; i = i + 1)
            {
                total = total + array[i];
            }
        return total;
    }
}
