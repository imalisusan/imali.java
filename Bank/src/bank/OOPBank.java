package bank;
public class OOPBank {
        public static void main(String[] args){
        int id=1122;
        double balance=20000;
        double deposit=3000;
        double withdraw=2500;
       Bank test=new Bank(id,balance);
       test.withdraw(withdraw);
       System.out.println("You have withdrawn "+withdraw+".\n");
       test.deposit(deposit);
       System.out.println("You have deposited "+deposit+".\n");
       System.out.println("Your account balance is: "+test.getBalance());
       System.out.println(test.toString());
       
        }
    
}
