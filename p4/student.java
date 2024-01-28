package p4;

public class student extends person
 {
    String usn,dept;
    float cgpa;
    student(String n,int a,String g,String id,String d,float c)
    {
        super(n,a,g);
        usn=id;
        dept=d;
        cgpa=c;
    }
    void display()
    {
        super.display();
        System.out.println("USN :"+usn);
        System.out.println("Departement :"+dept);
        System.out.println("CGPA :"+cgpa);
    }
}