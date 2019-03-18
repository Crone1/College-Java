public class StringContainsChar
{
    public static boolean containsLetter(String word, char letter)
    {
        String temp = Character.toString(letter);
        int i;
        for (i = 0; i < word.length(); i = i + 1)
        {
            if (word.substring(i,i + 1).equals(temp))
            {
                return true;
            }
        }
        return false;
    }
}
