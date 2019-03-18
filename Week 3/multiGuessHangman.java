public class multiGuessHangman
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
    
    public static String showLetters(String word, String guesses)
    {
        String final_word = "";
        int j;
        char [] word_array = new char[word.length()];
        
        int n;
        for(n = 0; n < word.length(); n++)
        {
                word_array[n] = '_';
        }
        
        for(j = 0; j < guesses.length();j++)
        {
            char guess = guesses.charAt(j);
            
            int i = 0;
            for (i = 0; i < word.length(); i++)
            {
                if (containsLetter(word.substring(i, i + 1), guess))
                {
                    word_array[i] = guess;
                }

            }
        }
        int k;
        
        for(k = 0; k < word_array.length;k++)
        {
        final_word = final_word + Character.toString(word_array[k]);
        }
        
        return final_word;
    }
}
