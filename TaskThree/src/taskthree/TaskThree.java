package taskthree;
import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) 
    {
         Scanner input= new Scanner(System.in);
        int numOne, numTwo;
    System.out.println("Input first number: ");
    numOne= input.nextInt();
    System.out.println("Input second number: ");
    numTwo= input.nextInt();
    if (numOne==numTwo)
        
            System.out.println("The two number are equal");
        
    else
            System.out.println("The two numbers are not equal");
        
    
  }
    
}
