package oopaccount;
import java.util.Date;
public class Account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        this.dateCreated=new Date();
    
    }
   
    public Account(int id,double balance)
    {
       this.id=id;
       this.balance=balance;
       this.annualInterestRate=4.5;
       this.dateCreated=new Date();
    }
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        double monthlyInterestRate=annualInterestRate/12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest()
    {
        double monthlyInterest=this.balance*(getMonthlyInterestRate()/100);
        return monthlyInterest;
    }
    public void withdraw(double withdrawAmountInput)    
    {
        this.balance=this.balance-withdrawAmountInput;
    }
    public void deposit(double depositAmountInput)
    {
        this.balance=this.balance+depositAmountInput;
    }
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    public String toString()//String Object Representation
    {
    return this.balance+""+this.id;
    }
}
