package p4;

public class employee extends person
 {
    int emp_id;
    double salary;
    String desig;
    employee(String n,int a,String g,int id,double s,String d)
    {
        super(n,a,g);
        emp_id=id;
        salary=s;
        desig=d;
    }
    void display()
    {
        super.display();
        System.out.println("Employee ID :"+emp_id);
        System.out.println("Salary :"+salary);
        System.out.println("Designation :"+desig);
    }
    
}
