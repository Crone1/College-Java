public class Test
{
    public static String firstShallBeLast(String word)
    {
        
        return word.substring(word.length() - 1) + word.substring(1, word.length() -1) + word.substring(0,1);
    }
}
