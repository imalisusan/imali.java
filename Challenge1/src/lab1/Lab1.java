package lab1;
import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    int count=0,positive=0,negative=0,number,total=0;
    float average;
    System.out.println("Please enter your numbers:");
    while((number = input.nextInt()) != 0) {
    total += number;
    count++;
    if(number > 0)
    {
        positive++;
    } 
    else if(number < 0) 
    {
        negative++;
    }
} 
average = total / (float) count;
System.out.println("The number of positives is " + positive);
System.out.println("The number of negatives is " + negative);
System.out.println("The total is " + total);
System.out.println("The average is " + average);
    }
    
}
