package readinginput;
import java.util.Scanner;
public class ReadingInput 
{
    public static void main(String[] args) 
    {
        Scanner readInput= new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        number= readInput.nextInt();
        double raisedTo=Math.pow(number, 3);
        System.out.println(number+" : "+raisedTo);
    }
    
}
