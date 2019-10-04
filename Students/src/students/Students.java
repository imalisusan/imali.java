package students;
public class Students {
    public static void main(String[] args) 
    {
        int id = 109459;
        String name ="Susan";
        int age = 20;
        double OOP1=90.90;
        CsStudent cs;
        cs = new CsStudent(id,name,age,OOP1);
        System.out.println(cs);
        BAStudent ba;
        ba = new BAStudent(120459,"Imali",20, 70);
    }
    
}
