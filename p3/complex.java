package p3;
/*
3.	Write a Java program using encapsulation and constructors to create a class to represent a complex number and perform the following operations: 
a.	Addition of two complex numbers
b.	Subtraction of two complex numbers
c.	Compare two complex numbers
*/
import java.util.*;
public class complex
 {
    double real,img;
    complex(double r,double i)
    {
        real=r;
        img=i;
    }
    void display()
    {
        System.out.println("Complex Number: "+real+"+i("+img+")");
    }
    void add(complex num)
    {
        complex res=new complex(0,0);
        res.real= this.real+num.real;
        res.img=this.img+num.img;
        System.out.println("The given complex number are");
        this.display();
        num.display();
        System.out.println("Resultant sum is");
        res.display();
        //return res;
    }
    void sub(complex num)
    {
        complex res=new complex(0,0);
        res.real= this.real-num.real;
        res.img=this.img-num.img;
        System.out.println("The given complex number are");
        this.display();
        num.display();
        System.out.println("Resultant difference is");
        res.display();
    }
    void cmp(complex num)
    {
        System.out.println("The given complex number are");
        this.display();
        num.display();
        if(this.real==num.real && this.img==num.img)
        System.out.println("They are equal");
        else
        System.out.println("They are unequal");

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r,i;
        System.out.println("Enter the real part of the first complex number ");
        r=sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number ");
        i=sc.nextDouble();
        complex num1=new complex(r,i);
        System.out.println("Enter the real part of the second complex number ");
        r=sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number ");
        i=sc.nextDouble();
        complex num2=new complex(r,i);
        num1.add(num2);
        num1.sub(num2);
        num1.cmp(num2);
        sc.close();
    }
}