public class oneGuessHangman
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
    
    public static String showLetter(String word, char guess)
    {
        int i = 0;
        String s = "";
        for (i = 0; i < word.length(); i++)
        {
            if (containsLetter(word.substring(i, i + 1), guess))
            {
                String c = Character.toString(guess);
                s = s + c;
            }
            else
            {
                s = s + "_";
            }
        }
        return s;
    }
}
