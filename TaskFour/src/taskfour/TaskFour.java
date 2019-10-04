package taskfour;
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) 
    {
       Scanner input= new Scanner(System.in);
       float fahrenheit,celcius,variation;
       System.out.println("Input a degree Fahrenheit: ");
       fahrenheit = input.nextInt();
       variation= -17;
       celcius= fahrenheit+variation;
       System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celcius+" in Celcius");
       
    }
    
}
