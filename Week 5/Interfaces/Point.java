public class Point implements Order
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
        if (x == point.getX())
            return (y < point.getY());
        else
            return (x < point.getX());
    }
}
