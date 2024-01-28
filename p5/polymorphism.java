package p5;
/*
 * 5.	Write a java program using compile time polymorphism (method overloading) to compare two strings. 
 * The program should implement two different versions of strcmp the first version of usrstrcmp () that 
 * comparestwo string the second version should compare only specified number of characters from first 
 * string with second string and display the results. 
 */
import java.util.*;
public class polymorphism
 {
    void usrstrcmp(String s1,String s2)
    {
        if(s1.compareTo(s2)==0)
        System.out.println("The given strings \'"+s1+"\' and \'"+s2+"\' are equal ");
        else
        System.out.println("The given strings \'"+s1+"\' and \'"+s2+"\' are unequal");
    }
    void usrstrcmp(String s1,String s2,int n)
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("The given strings \'"+s1+"\' and \'"+s2+"\' are equal when compared till "+n+" index");
        else
        System.out.println("The given strings \'"+s1+"\' and \'"+s2+"\' are unequal when compared till "+n+" index");
    }
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        s1=sc.nextLine();
        System.out.println("Enter the second string");
        s2=sc.nextLine();
        polymorphism obj=new polymorphism();
        obj.usrstrcmp(s1,s2);
        System.out.println("Enter till  which index you want to compare both the strings");
        int n=sc.nextInt();
        obj.usrstrcmp(s1, s2, n);
        sc.close();
    }
    
}
