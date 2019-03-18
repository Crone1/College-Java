public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean lessThan(Order other) 
    {
        Cat cat = (Cat) other;
        return ((this.name.length() < cat.name.length()));
    }
}
