package tasktwo;
import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int numOne, numTwo,sum,difference,product,modulus;
        float quotient;
    System.out.println("Input first number: ");
    numOne= input.nextInt();
    System.out.println("Input second number: ");
    numTwo= input.nextInt();
    sum=numOne+numTwo;
    System.out.println(numOne+ " + " +numTwo+ " = " +sum);
    difference=numOne-numTwo;
    System.out.println(numOne+ " - " +numTwo+ " = "+difference);
    product=numOne*numTwo;
    System.out.println(numOne+ " * " +numTwo+ " = "+product);
    quotient=numOne/numTwo;
    System.out.println(numOne+ " / " +numTwo+ " = "+quotient);
    modulus=numOne%numTwo;
    System.out.println(numOne+ " % " +numTwo+ " = "+modulus);
    
    
    }
    
}
