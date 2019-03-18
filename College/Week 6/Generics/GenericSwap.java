public class GenericSwap
{
    public static <T> void swap(T [] array, int pos1, int pos2)
    {
        T tmp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = tmp;
    }
}
