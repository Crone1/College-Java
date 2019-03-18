public class CompareChar2First
{
    public static boolean isFirstLetter(String word, char letter)
    {
        String temp = Character.toString(letter);
        return (word.substring(0,1).equals(temp));
    }
}
