package p6;

public class CanaraBank extends Bank 
{
    float interest;
    CanaraBank(String n, long a,double b)
    {
        super(n,a,b);
        interest=6.1f;
    }
    void cal_roi()
    {
        double roi=interest*bal/100.0;
        super.display();
        System.out.println("Interest rate offered by Canara Bank is"+interest+"%");
        System.out.println("Interest amount for the account balance is "+roi);
    }
}