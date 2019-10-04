package lab2.pkg1.pkg4;
import java.util.Arrays;
import java.util.Scanner;
public class Lab214 
{
    public static void main(String[] args) 
    {
     Scanner input= new Scanner(System.in); 
     int [] numbers={19,65,71,70,64,196,18,53};
     Arrays.sort(numbers);
     System.out.println("Minimum: "+numbers[0]);
     System.out.println("Maximum: "+numbers[numbers.length-1]);
    }
    
}
