/*
1.	Write a java program:
a.	To calculate and display the roots of Quadratic Equation.
b.	To multiply two arrays and display the result.
c.	To sort the elements in ascending and descending order using bubble sort algorithm
*/
import java.util.Scanner;
public class p1
{
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        //quadratic equation
        System.out.println("Enter a quadratic equation whose roots you wanna compute.\nThe equation is of the form ax^2+bx+c");
        int a,b,c;
        System.out.println("Enter the value of 'a'");
        a=sc.nextInt();
        System.out.println("Enter the value of 'b'");
        b=sc.nextInt();
        System.out.println("Enter the value of 'c'");
        c=sc.nextInt();
        double d=Math.pow(b, 2)-4*a*c;
        double root1,root2;
        if(d>0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.print("The roots of the quadratic equation "+a+"x^2+"+b+"x+"+c+" are distinct which are ");
            System.out.println(root1+" and "+root2);
        }
        else if(d==0)
        {
            root1=-b/(2*a);
            System.out.println("The roots of the quadratic equation "+a+"x^2+"+b+"x+"+c+" is same which is "+root1);
        }
        else
        {
            root1=-b/(2*a);
            root2=Math.sqrt(Math.abs(d));
            System.out.print("The roots of the quadratic equation "+a+"x^2+"+b+"x+"+c+" are imaginary which are ");
            System.out.println(root1+"+i"+root2+" and "+root1+"-i"+root2);

        }
        //array multiplication
        System.out.println("Enter the dimension of first array");
        int dim1=sc.nextInt();
        int ar1[]=new int[dim1];
        for(int i=0;i<dim1;i++)
        {
            System.out.println("Enter a number for array ");
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter the dimension of second array");
        int dim2=sc.nextInt();
        int ar2[]=new int[dim2];
        for(int i=0;i<dim2;i++)
        {
            System.out.println("Enter a number for array ");
            ar2[i]=sc.nextInt();
        }
        int res[]=new int[Math.min(dim1,dim2)];
        for(int i=0;i<res.length;i++)
        {
            res[i]=ar1[i]*ar2[i];
        }
        System.out.println("First Array");
        for(int i=0;i<dim1;i++)
        {
            System.out.print(ar1[i]+" ");
        }
        System.out.println("\nSecond Array");
        for(int i=0;i<dim2;i++)
        {
            System.out.print(ar2[i]+" ");
        }
        System.out.println("\nResultant Array");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        //sorting
        System.out.println("\nEnter the dimension of array which you want to sort in ascending and descending order");
        dim1=sc.nextInt();
        int ar[]=new int[dim1];
        for(int i=0;i<dim1;i++)
        {
            System.out.println("Enter a number for array ");
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<dim1-1;i++)
        {
            for(int j=0;j<dim1-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array(Ascending Order)");
        for(int i=0;i<dim1;i++)
        {
            System.out.print(ar[i]+" ");
        }
        for(int i=0;i<dim1-1;i++)
        {
            for(int j=0;j<dim1-i-1;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Array(Descending Order)");
        for(int i=0;i<dim1;i++)
        {
            System.out.print(ar[i]+" ");
        }
        sc.close();

    }
    
}