package students;
public class BAStudent extends UniversityStudent
{
    private double music;
    public BAStudent()
    {
        super();
        music=0.0;
    }
    public BAStudent(int id, String name,int age,double music)
    {
        super(id,name,age);
        this.music = music;
    }
    public double getmusic()
    {
        return this.music;
    }
    public void setmusic()
    {
        this.music = music;
    }
    public String toString()
    {
    return super.toString()+" "+this.music;
    }
}

