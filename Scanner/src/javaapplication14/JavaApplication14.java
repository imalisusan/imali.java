package javaapplication14;
import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) 
    {
    Scanner input =new Scanner(System.in);    
    int time,amount;
    double rate, newRate, finalAmount;
    System.out.println("Please enter the amount:");
    amount=input.nextInt();
    System.out.println("Please enter the number of years:");
    time= input.nextInt();
    System.out.println("Please enter the interest rate:");
    rate=input.nextFloat();
    newRate=Math.pow((1+rate),(time*12));
    System.out.println(newRate);
    finalAmount=(double) (amount*newRate);
    System.out.println(finalAmount);
    
    }
}
    

