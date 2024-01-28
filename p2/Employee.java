package p2;
/*
2.	Write a java program to create an Employee database which stores following information about the Employee: Name, Emp_id, department, age, and designation. Perform the following operations:
a.	Read and display the details of at least five Employees.
b.	Calculate and display the sum of salary of all the employees of “sales” department.
c.	Retrieve the details of “highest paid manager” in the purchase department.

 */
import java.util.*;
public class Employee 
{
    String Name;
    int Emp_id;
    String dept;
    int age;
    String desig;
    double sal;
    Employee(String n,int e,String dep,int a, String d,double s)
    {
        Name=n;
        Emp_id=e;
        dept=dep;
        age=a;
        desig=d; 
        sal=s;
    }
    void display()
    {
        System.out.println("Name:"+Name);
        System.out.println("Employee ID:"+Emp_id);
        System.out.println("Department:"+dept);
        System.out.println("Age:"+age);
        System.out.println("Designation"+desig);
        System.out.println("Salaray"+sal);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee data[]=new Employee[5];
        String name,dept,desig;
        int Emp_id,age;
        double s;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the following details of the Employee");
            System.out.println("Name:");
            name=sc.next();
            System.out.println("Employee ID:");
            Emp_id=sc.nextInt();
            System.out.println("Department:");
            dept=sc.next();
            System.out.println("Age:");
            age=sc.nextInt();
            System.out.println("Designation");
            desig=sc.next();
            System.out.println("Salaray");
            s=sc.nextDouble();
            data[i]=new Employee(name,Emp_id,dept,age,desig,s);
        }
        System.out.println("The Employee Databse has following data ");
        for(int i=0;i<5;i++)
        {
            System.out.println("Employee"+i);
            data[i].display();
        }
        double tot=0;
        for(Employee emp : data)
        {
            if(emp.dept.equalsIgnoreCase("sales"))
            {
                tot+=emp.sal;
            }

        }
        System.out.println("Total salary of 'sales' department is"+tot);
        int hig=0;
        for(int i=0;i<5;i++)
        {
            if(data[i].sal>data[hig].sal && data[i].desig.equalsIgnoreCase("manager") && data[i].dept.equalsIgnoreCase("purchase"))
            {
                hig=i;
            }

        }
        System.out.println("Highest Paid Manager in the purchase department is");
        data[hig].display();
        sc.close();
    } 
}