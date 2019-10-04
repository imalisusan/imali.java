package question1;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) 
    {
       Scanner input= new Scanner(System.in);
       double fahrenheit,celcius;
       System.out.println("Input a degree in Celcius: ");
       celcius = input.nextInt();
       fahrenheit= (9/5)*celcius+32;
       System.out.println(celcius+" degree celcius is equal to "+fahrenheit+" in Fahrenheit");
    }
    
}
