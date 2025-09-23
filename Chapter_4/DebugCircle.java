public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   
   public static void main(String[] arg){
      DebugCircle circle = new DebugCircle(10);
      System.out.print("Radius: "+circle.getRadius()+"\nDiameter: "+circle.getDiameter()+"\nArea: "+circle.getArea()+".");
      
   }
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
      }
   public int getRadius()
   {
      return radius;
   }
   public int getDiameter()
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
}
