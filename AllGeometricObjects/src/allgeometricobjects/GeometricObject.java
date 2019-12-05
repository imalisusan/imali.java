package allgeometricobjects;
import java.util.Date;
public class GeometricObject 
{
    private String color;
    private boolean filled;
    private Date dateCreated= new Date();
    public GeometricObject()
    {
    color="Unknown";
    filled=true;
    
    }
    public GeometricObject(String color,boolean filled)
    {
    
    }
    public String getcolor()
    {
    return this.color;
    }
    public void setcolor(String color)
    {
    this.color=color;
    }
    public boolean getfilled()
    {
    return this.filled;
    }
    public void setfilled(boolean filled)
    {
    this.filled=filled;
    }
    public Date getDateCreated()
    {
    return this.dateCreated;
    }
    public void setDate(Date dateCreated)
    {
    this.dateCreated=dateCreated;
    }
    @Override
    public String toString()
    {
    return this.color+" "+this.filled+" "+this.dateCreated;
    }
}
