package objects;
public class OOPRectangle {
    public static void main(String[] args) {
        //System.out.print(small.width);
        //double rectW=2.0;
       // double rectH=3.0;
        Rectangle small = new Rectangle();
        System.out.println(small.getArea());
        System.out.println(small.getPerimeter());
        Rectangle large = new Rectangle(234.0, 100.0);
        System.out.println(large.getArea());
        System.out.println(large.getPerimeter());
        Rectangle largest = new Rectangle(10000.0, 20000.0);
        System.out.println(largest.getArea());
        System.out.println(largest.getPerimeter());
        
        
        
    }
    
}
