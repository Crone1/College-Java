import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength
{
    public static void main(String [] args)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        map.put(6, 0);
        map.put(7, 0);
        map.put(8, 0);
        map.put(9, 0);
        map.put(10, 0);
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (in.hasNextLine())
        {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                int count = map.get(words[i].length());
                map.put(words[i].length(), count + 1);
            }
            line = in.nextLine();
        }
        if (!(map.get(1) == 0))
        System.out.println("1: " + map.get(1));
        if (!(map.get(2) == 0))
        System.out.println("2: " + map.get(2));
        if (!(map.get(3) == 0))
        System.out.println("3: " + map.get(3));
        if (!(map.get(4) == 0))
        System.out.println("4: " + map.get(4));
        if (!(map.get(5) == 0))
        System.out.println("5: " + map.get(5));
        if (!(map.get(6) == 0))
        System.out.println("6: " + map.get(6));
        if (!(map.get(7) == 0))
        System.out.println("7: " + map.get(7));
        if (!(map.get(8) == 0))
        System.out.println("8: " + map.get(8));
        if (!(map.get(9) == 0))
        System.out.println("9: " + map.get(9));
        if (!(map.get(10) == 0))
        System.out.println("10: " + map.get(10));
    }
}
