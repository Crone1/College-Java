public class PrintCommandLine
{
    public static void main(String [] args)
    {
        int i = 0;
        for (String arg : args)
        {
            System.out.println("args[" + i + "] = " + arg);
            i = i + 1;
        }
    }
}