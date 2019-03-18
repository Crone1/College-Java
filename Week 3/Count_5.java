public class Test
{
    public static int countFives(int [] array)
    {
        int i;
        int total = 0;
        for (i = 0; i < array.length; i = i + 1)
            {
                if (array[i] == 5)
                {
                total = total + 1;
                }
            }
        return total;
    }
}
