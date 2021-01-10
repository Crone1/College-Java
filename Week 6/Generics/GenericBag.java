@SuppressWarnings("unchecked")
public class GenericBag<T>
{
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   private T temp;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i=0; i < numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }

   public int length()
   {
      return numElements;
   }
   
   public void remove(T s)
   {
        for (int i = numElements - 1; i >= 0;  i--)
        {
            if (bag[i].equals(s))
            {
                for (int j = i + 1; j < numElements; j ++)
                {
                    bag[j-1] = bag[j];
                }
                numElements--;
                break;
            }
        }
   }
}
