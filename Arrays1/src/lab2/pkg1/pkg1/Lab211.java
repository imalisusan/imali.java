package lab2.pkg1.pkg1;
import java.util.Scanner;
public class Lab211 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        String[] beverage={"Fanta","Wine"};
        int[] price={60,300};
        String[] type={"soft","alcoholic"};
        System.out.println("Please choose the kind of drink you want to take:\n\n Type either Fanta or Wine:\n");
        String choice = input.nextLine();
        switch (choice) {
            case "Fanta":
                System.out.println(beverage[0]+" is a "+type[0]+" drink, and costs Kshs."+price[0]);
                break;
            case "Wine":
                System.out.println(beverage[1]+" is a "+type[1]+" drink, and costs Kshs."+price[1]);
                break;
            default:
                System.out.println("Please choose a between Fanta and Wine.");
                break;
        }
        
    }
    
}
