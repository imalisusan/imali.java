package allgeometricobjects;
public class RectangleObject extends GeometricObject 
{
    private double width;
    private double height;
    private double perimeter;
    private double area;
    public RectangleObject()
    {
        super();
        width=0;
        height=0;
    }
    public RectangleObject(double width, double height)
    {
    super();
    }
    public RectangleObject(String color,boolean filled,double width,double height)
   {
   super(color,filled);
   this.width=width;
   this.height=height;
   }
    public double getWidth()
    {
        return this.width;
    }
    public void setWidth(double width)
    {
    this.width=width;
    }
    public double getHeight()
    {
    return this.height;
    }
    public void setHeight(double height)
    {
    this.height=height;
    }
    public void setPerimeter(double width, double height)
    {
    perimeter=(2*height)+(2*width);
    this.perimeter=perimeter;
    }
    public double getPerimeter()
    {
    return this.perimeter;
    }
    public void setArea(double width, double height)
    {
    area=height*width;
    this.area=area;
    }
    public double getArea()
    {
    return this.area;
    }
    
}
