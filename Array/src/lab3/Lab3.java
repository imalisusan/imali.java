package lab3;
public class Lab3 {
    public static void main(String[] args) 
    {
       System.out.println("Kilograms    Pounds");

    for (int kg = 1; kg < 200; kg+=1) 
    {
    float lb= (float) (kg*2.2);
    System.out.println(kg+"\t"+lb);
    }
}
public static final double CONVERSION_FACTOR = 2.2;
} 
    
    

