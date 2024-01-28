package p6;
/*
 * 6.	Write a Java program to define a base class bank, which holds various details of customers such 
 * as name, account number, balance and member functions to read, display and an abstract method to
 *  calculate rate of interest earned by all the account holders. Derive three classes namely City-Bank,
 *  SBI-bank, Canara-bank from this base class, which are offering different rate of interests. Extend 
 * the calculate method of base class with in these derived classes to calculate and display the interest
 *  earned by all the account holders of these banks
 */
import java.util.*;
public abstract class Bank 
{
    protected String name;
    protected long acc_no;
    protected double bal;
    Bank(String n, long a,double b)
    {
        name= n;
        acc_no=a;
        bal=b;
    }
     void display()
        {
            System.out.println("Account Holder's name:"+name);
            System.out.println("Account Number:"+acc_no);
            System.out.println("Account Balance:"+bal);
        }
    abstract void cal_roi();
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String nm;
        long acc;
        double ba;
        System.out.println("Enter the name of the customer of Canara Bank account ");
        nm=sc.next();
        System.out.println("Enter the account number  ");
        acc=sc.nextLong();
        System.out.println("Enter the account balance ");
        ba=sc.nextDouble();
        CanaraBank obj1= new CanaraBank(nm, acc, ba);
        obj1.cal_roi();
        System.out.println("Enter the name of the  customer of City Bank account ");
        nm=sc.next();
        System.out.println("Enter the account number  ");
        acc=sc.nextLong();
        System.out.println("Enter the account balance ");
        ba=sc.nextDouble();
        CityBank obj2= new CityBank(nm, acc, ba);
        obj2.cal_roi();
        System.out.println("Enter the name of the  customer of SBI Bank account ");
        nm=sc.next();
        System.out.println("Enter the account number  ");
        acc=sc.nextLong();
        System.out.println("Enter the account balance ");
        ba=sc.nextDouble();
        SBIBank obj3= new SBIBank(nm, acc, ba);
        obj3.cal_roi();
        sc.close();
    }   
    
}
