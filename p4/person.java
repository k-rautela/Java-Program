package p4;
/*
 * 4.	Write a java program to define a base class called person which stores information about a person such as name, age, gender. 
 * Derive two new classes employee and student and extend the base class methods in derived class to read and display 
 * the details that are specific to student and employee. 
 * Display the details of at least five students and five employees.
 */
import java.util.*;
public class person 
{
    String name,gender;
    int age;
    person(String n,int a,String g)
    {
        name=n;
        age=a;
        gender=g;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
    }
    public static void main(String args[])
    {
        String na,gen,dep,des,us;
        int id,ag;
        float cg;
        double sal;
        Scanner sc=new Scanner(System.in);
        student list[]=new student[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter student's name");
            na=sc.next();
            System.out.println("Enter student's age");
            ag=sc.nextInt();
            System.out.println("Enter student's gender");
            gen=sc.next();
            System.out.println("Enter student's  USN");
            us=sc.next();
            System.out.println("Enter student's department");
            dep=sc.next();
            System.out.println("Enter student's  CGPA");
            cg=sc.nextFloat();
            list[i]= new student(na,ag,gen,us,dep,cg);
        }
        employee data[]=new employee[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter employee's name");
            na=sc.next();
            System.out.println("Enter employee's age");
            ag=sc.nextInt();
            System.out.println("Enter employee's gender");
            gen=sc.next();
            System.out.println("Enter employee's  ID");
            id=sc.nextInt();
            System.out.println("Enter employee's salary");
            sal=sc.nextDouble();
            System.out.println("Enter employee's  department");
            des=sc.next();
            data[i]= new employee(na,ag,gen,id,sal,des);
        }
        System.out.println("The list of students are:");
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+"Student");
            list[i].display();
        }
        System.out.println("The list of employees are:");
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+"Employee");
            data[i].display();
        }
        sc.close();
    }
}