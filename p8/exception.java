package p8;
/*
 * 8.	Write a java program to read two positive integers and perform the division operation on them
 *  and display the result if a user enters a positive integer and non-zero denominator. Else, If the 
 * input is negative or the denominator is zero, generate negative number input and divide by zero 
 * exception to handle the scenario.
 */
import java.util.*;
public class exception
 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive numerator");
        int num=sc.nextInt();
        System.out.println("Enter a positive denominator");
        int den=sc.nextInt();
        try
        {
            if(num<0|| den<0)
            throw new InputMismatchException("Only positive integer allowed");
            else if(den==0)
            throw new ArithmeticException("Denominator shouldn't be zero");
            else
            {  
                float res=num/(float)den;
                System.out.println("Divison of "+num+" with "+den+" gives "+res);
            }

        }
        catch( ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
        
    }
    
}
