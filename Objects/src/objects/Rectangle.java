package objects;
public class Rectangle {
    private double width;
    private double height;
    public Rectangle()
    {
    width=1.0;
    height=1.0;
    System.out.println("Initialized");
    
    }
    public Rectangle(double w, double h)
    {
    width=w;
    height=h;
    System.out.println("Initialized II");
    }
    public double getArea()
    {
    double rectangleArea;
    rectangleArea= width*height;
        return rectangleArea;
    }
    public double getPerimeter()
    {
    double rectanglePerimeter =(double)2*(width+height);
        return rectanglePerimeter;
    }
    
}    
    

