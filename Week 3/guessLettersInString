public class guessLettersInString
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
    public static boolean Subset(String word, String guesses)
    {
        int i = 0;
        for (i = 0; i < word.length(); i++)
            {
                char a = word.charAt(i);
                if (!containsLetter(guesses, a))
                return false;
                
            }
            return true;
    }
}
