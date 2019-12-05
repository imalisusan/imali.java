package javaapplication34;
public class Circle 
{
    private double radius;
    private double area;
    private double perimeter;
    public Circle()
    {
    this.radius=1.0;
    }
    public Circle(double radius)
    {
    this.radius=radius;
    }
    public double getRadius()
    {
    return this.radius;
    }
    public void setRadius(double radius)
    {
    this.radius=radius;
    }
    public double getArea()
    {
    area= Math.PI*this.radius*this.radius;
    return this.area;
    }
    public double getPerimeter()
    {
    perimeter=2*Math.PI*this.radius;
    return this.perimeter;
    }
    public String toString()
    {
    return this.radius+" "+this.area+" "+this.perimeter;
    }
    
}
