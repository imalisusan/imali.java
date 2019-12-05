package myclock;
public class Clock 
{
  public int hours; 
  public int minutes;
  public int seconds;
  public int secAdd1;
  public int secAdd2;
  public Clock()
  {
      hours=12;
      minutes=0;
      seconds=0;
  }
  public Clock(int hours, int minutes, int seconds)
  {
  this.hours=hours;
  this.minutes=minutes;
  this.seconds=seconds;
  }
  public Clock(int seconds)
  {
     this.seconds=seconds%60;
     hours=seconds/60;
     this.minutes=hours%60;//minutes
     this.hours=hours/60;//hours
  }
  public void setClock(int seconds)
  {
    this.seconds=seconds;
  }
  public int getHours()
  {
    return this.hours;
  }
  public int getMinutes()
  {
    return this.minutes;
  }
  public int getSeconds()
  {
    return this.seconds;
  }
  public void setHours(int hours)
  {
      this.hours=hours;
  }
  public void setMinutes()
  {
      this.minutes=minutes;
  }
  public void setSeconds()
  {
      this.seconds=seconds;
  }
  public void tick()
  {
      this.seconds=seconds+1;
      if (seconds>59)
     {
         seconds=seconds-60;
         minutes=minutes+1;
     }
     if(minutes>59)
     {
         minutes=minutes-60;
         hours=hours+1;
     }
  }
  public void tickDown()
  {
    this.seconds--;
  }
  public static String addClock(Clock firstClock,Clock secondClock)
  {
     int secSum=firstClock.getSeconds()+secondClock.getSeconds();
     int minSum=firstClock.getMinutes()+secondClock.getMinutes();
     int hourSum=firstClock.getHours()+secondClock.getHours();
     if (secSum>59)
     {
         secSum=secSum-60;
         minSum=minSum+1;
     }
     if(minSum>59)
     {
         minSum=minSum-60;
         hourSum=hourSum+1;
     }
     return "("+String.format("%02d",hourSum)+":"+String.format("%02d",minSum)+":"+String.format("%02d",secSum)+")";
  }
  public String toString()
  {
    return "("+String.format("%02d",this.hours)+":"+String.format("%02d",this.minutes)+":"+String.format("%02d",this.seconds)+")";
  }
  
}
