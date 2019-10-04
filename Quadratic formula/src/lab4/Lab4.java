package lab4;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double discriminant=b * b - 4 * a * c;
        double part1 = Math.sqrt(discriminant);
        if (discriminant>0)
        {
        double root1 = (-b +  part1) / (2*a) ;
        double root2 = (-b -  part1) / (2*a) ; 
        System.out.println(root1+"\t"+root2);
        }
        else if(discriminant==0)
        {
        double root1 = (-b +  part1) / (2*a); 
        System.out.println(root1);
        }
        else
        {
            System.out.println("The equation has no real roots.");
        }
        
    }
    
}
