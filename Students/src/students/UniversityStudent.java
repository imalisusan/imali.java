package students;
public class UniversityStudent 
{
    private int id;
    private String name;
    private int age;
    public UniversityStudent()
    {
        this.name = "Unknown";
        this.age = 0;
        this.id = 0;
    }
    public UniversityStudent(int id, String name, int age)
    {
      this.id = id;
      this.name = name;
      this.age = age;
    }
    public int getId()
    {
    return this.id;
    }
    public void setId()
    {
    this.id = id;
    }
    public String getname()
    {
    return this.name;
    }
    public void setname()
    {
    this.name = name;
    }
    public int getAge()
    {
    return this.age;
    }
    public void setAge()
    {
    this.age = age;
    }
    public String toString()
    {
    return this.id+" "+this.name+" "+this.age;
    }
    
}
