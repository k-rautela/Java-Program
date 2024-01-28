package p9;
import java.util.*;
public class implement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double val;
        System.out.println("Enter the amount of euros which you want to convert in RS");
        val=sc.nextDouble();
        currency obj= new currency(val);
        obj.convert();
        System.out.println("Enter the amount of GB whose value you want to know in bytes");
        val=sc.nextDouble();
        bytes ob=new bytes(val);
        ob.convert();
        sc.close();
    }
    
}
