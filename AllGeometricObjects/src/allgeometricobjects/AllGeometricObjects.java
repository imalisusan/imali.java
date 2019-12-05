package allgeometricobjects;
public class AllGeometricObjects 
{
    public static void main(String[] args) 
    {
    displayObject(new CircleObject("Red",false,1));
    displayObject(new RectangleObject("Black",true,1,1));
    }
    public static void displayObject(GeometricObject object)
    {
        System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getcolor());
    }
    }

