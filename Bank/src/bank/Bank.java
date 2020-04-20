package bank;
public class Bank 
{
    private int id;
    private double balance;
    public Bank()
    {
        this.id=0;
        this.balance=0;
    
    } 
    public Bank(int id,double balance)
    {
       this.id=id;
       this.balance=balance;
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
    
    public void withdraw(double withdrawAmountInput)    
    {
        this.balance=this.balance-withdrawAmountInput;
    }
    public void deposit(double depositAmountInput)
    {
        this.balance=this.balance+depositAmountInput;
    }
    public String toString()//String Object Representation
    {
    return "User ID:"+this.id+"\n"+"Your account has Kshs."+this.balance+"";
    }
}

