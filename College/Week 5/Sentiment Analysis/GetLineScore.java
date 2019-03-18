public class GetLineScore
{
    int score;
    String word;
    
    public WordScore(String string)
    {
        word = string;
    }
    
    public int score(String str)
    {
        String[] parts = str.split(" ");
        score = Integer.parseInt(parts[1]);
        for (int i = 0; i < parts.length; i ++)
            {
                if (parts[i].equals(word))
                {
                    return score;
                }
            }
        return (-1);
    }
}
