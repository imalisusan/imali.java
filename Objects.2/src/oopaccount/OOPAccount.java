package oopaccount;
import java.util.Date;
public class OOPAccount                                                                         
{
    public static void main(String[] args) 
    {
        int id=1122;
        double balance=20000;
        double annualInterestRate=4.5;
        double deposit=3000;
        double withdraw=2500;
       Account test=new Account(id,balance);
       System.out.println("Your account was created on: "+test.getDateCreated()+"\n");
       test.withdraw(withdraw);
       System.out.println("You have withdrawn "+withdraw+".\n");
       test.deposit(deposit);
       System.out.println("You have deposited "+deposit+".\n");
       System.out.println("Your monthly interest is: "+test.getMonthlyInterest());
       System.out.println("Your account balance is: "+test.getBalance());
       System.out.println(test.toString());
       Account first=new Account(1123,50000);
       System.out.println("Your account was created on: "+test.getDateCreated()+"\n");
       test.withdraw(4000);
       test.deposit(5000);
       System.out.println("Your monthly interest is: "+test.getMonthlyInterest());
       System.out.println("Your account balance is: "+test.getBalance());
       System.out.println(test.toString());
       Account second=new Account(1124,60000);
       System.out.println("Your account was created on: "+test.getDateCreated()+"\n");
       test.withdraw(8000);
       test.deposit(40000);
       System.out.println("Your monthly interest is: "+test.getMonthlyInterest());
       System.out.println("Your account balance is: "+test.getBalance());
       System.out.println(test.toString());
       
    }
    
}
