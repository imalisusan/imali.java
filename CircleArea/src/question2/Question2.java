package question2;
import java.util.Scanner;
public class Question2 
{

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        float radius,length;
        double area, volume;
        System.out.println("Please input the radius:");
        radius= input.nextFloat();
        System.out.println("Please input the length:");
        length=input.nextFloat();
        area=radius*radius*(Math.PI);
        volume=area*length;
        System.out.println(area);
        System.out.println(volume);
       
    }
    
}
