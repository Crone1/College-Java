public class Test
{
    public static void reverse(int [] array)
    {
        int j;
        int i = 0;
        int temp;
        for(j = array.length - 1; j >= array.length/2; j--)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        }
    }
}
