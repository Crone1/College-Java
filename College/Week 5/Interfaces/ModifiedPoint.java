public class ModifiedPoint implements Order
{
    private double x, y;

    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }

    public boolean lessThan(Order other) 
    {
        Point point = (Point) other;
        return (x*x + y*y < point.getX()*point.getX() + point.getY()*point.getY());
    }
}
