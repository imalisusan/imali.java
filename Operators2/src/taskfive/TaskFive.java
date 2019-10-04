package taskfive;
import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
        int numOne, numTwo, sum, difference, product, intDiff, maximum, minimum;
        float average;
    System.out.println("Input first number: ");
    numOne= input.nextInt();
    System.out.println("Input second number: ");
    numTwo= input.nextInt();
    sum=numOne+numTwo;
    System.out.println("Sum of two integers: " +sum);
    difference=numOne-numTwo;
    System.out.println("Difference of two integers: "+difference);
    product=numOne*numTwo;
    System.out.println("Product of two integers: "+product);
    average=(numOne+numTwo)/2;
    System.out.println("Average of two integers: "+average);
    //intDiff=(average-numOne)+(average-numTwo);
    //System.out.println("Distance of two integers: "+intDiff);
    if(numOne>numTwo)
    {
        maximum=numOne;
        minimum=numTwo;
    }
    else
    {
        maximum=numTwo;
        minimum=numOne;    
    }
       System.out.println("Max Integer: "+maximum);
       System.out.println("Min Integer: "+minimum);
    
    
    
    }
    
}