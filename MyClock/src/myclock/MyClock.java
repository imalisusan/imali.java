package myclock;
public class MyClock 
{
    public static void main(String[] args) 
    {
        Clock firstClock=new Clock(3602);
        System.out.println(firstClock.toString()+"\n");
        Clock secondClock=new Clock(2,45,45);
        System.out.println(secondClock.toString()+"\n");
        for(int i=0;i<10;i++)
        {
        firstClock.tick();
        System.out.println("This is the time after incerementing the first clock by "+(i+1)+" seconds."+firstClock.toString());
        }
        System.out.println("\n");
        System.out.println("The total time added together is: "+firstClock.addClock(firstClock,secondClock));
    }
    
}
