import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MakeStudentMap
{
    public static Map<String, Integer> makeMap(Scanner in)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();

        //Scanner in = args[1];
        while(in.hasNext())
        {
            String name = in.next();
            int mark = in.nextInt();
            map.put(name, mark);
        }

        return map;
    }
}
