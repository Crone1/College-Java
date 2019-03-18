public class GenericPair<T,T2>
{
    T object1;
    T2 object2;
    
    
    public Pair(T o1, T2 o2)
    {
        object1 = o1;
        object2 = o2;
    }
    
    public String toString()
    {
        return (object1 + " " + object2);
    }
}
