package allgeometricobjects;
public class CircleObject extends GeometricObject
{
   private double radius;
   private double area;
   private double perimeter;
   private double diameter;
   public CircleObject()
   {
       super();
   }
   public CircleObject(double radius)
   {
   super();
   radius=0;
   }
   public CircleObject(String color,boolean filled,double radius)
   {
   super(color,filled);
   }
   public double getRadius()
   {
   return this.radius;
   }
   public void setRadius(double radius)
   {
   this.radius=radius;
   }
   public void setArea(double radius)
   {
       area=Math.PI*radius*radius;
   }
   public double getArea()
   {
   return this.area;
   }
   public double getPerimeter()
   {
       return this.perimeter;
   }
   public void setPerimeter()
   {
       perimeter=2*radius;
   }
   public double getDiameter()
   {
       return this.diameter;
   }
   public void setDiameter(double diameter)
   {
       diameter=Math.PI*diameter;
   }
   
   public  String printCircle()
   {
       return super.toString()+" "+area+" "+perimeter;
   }
   
   
}
