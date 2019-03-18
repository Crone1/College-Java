public class PointClass
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
   
   public Point midPoint(Point point)
   {
       double x1 = this.x;
       double y1 = this.y;
       double x2 = point.x;
       double y2 = point.y;
       
       return new Point((x1 + x2)/2, (y1 + y2)/2);
   }
}
