package lab2.pkg1.pkg2;
import java.util.Scanner;
public class Lab212 
{
    public static void main(String[] args) 
    {
      Scanner input= new Scanner(System.in);
      int [] numbers={95,55,103,12,30,124,72,180,39,48,28,18,8,19,65,71,70,64,196,18,53};
      int prime[]= new int[15];
      for(int i=0;i<21;i++)
      {
         int f=0;
          for(int j=2;j<=i;j++)
	{
            if(i%j==0)
		{
		break;
                }
		if(i==j)
		{
		prime[f]=numbers[i];
                f++;
		}
		else
		{
			
		}
        }
          
      }
      for(int k=0;k<15;k++)
      {
          System.out.println(prime[k]);
      }
    }
    
    
}
