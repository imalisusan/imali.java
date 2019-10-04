package students;
public class CsStudent extends UniversityStudent
{
    private double OOP1;
    public CsStudent()
        {
        super();
        OOP1=0.0;
        }
    public CsStudent(int id, String name, int age, double OOP1)
    {
        super(id,name,age);
        this.OOP1 = OOP1;
    }
    public double getOOP1()
    {
        return this.OOP1;
    }
    public void setOOP1(double OOP1)
    {
        this.OOP1 = OOP1;
    }
    public String toString()
    {
        return super.toString()+" "+this.OOP1;
    }
}
