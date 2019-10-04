package taskone;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) 
    {
    Scanner input= new Scanner(System.in);
        int numOne, numTwo,product;
    System.out.println("Input first number: ");
    numOne= input.nextInt();
    System.out.println("Input second number: ");
    numTwo= input.nextInt();
    product=numOne*numTwo;
    System.out.println("Expected output: "+product);
    
    
    }
    
}
