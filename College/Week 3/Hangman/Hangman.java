import java.util.Scanner;

public class Hangman
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
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);
        
        System.out.println("The word is");
        String hidden = "";
        int k;
        for (k = 0; k < word.length(); k++)
            hidden = hidden + "_";
            
        String guesses = "";
        
        int j = 0;
        while (!hidden.equals(word))
        {
            System.out.println(hidden);
            System.out.println("Guess a letter:");
        
            char c = in.next().charAt(0);
            
            if (containsLetter(word, c))
            {
                guesses = guesses + Character.toString(c);
                hidden = Word.showLetters(word, guesses);
            }
            j++;
        }
        System.out.println(word);
        System.out.println("Well Done, the word was " + word + ".");
    }
}
