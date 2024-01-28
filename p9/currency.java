package p9;
public class currency implements compute
 {
    double euro;
    currency(double e)
    {
        euro=e;
    }
    final double conamt=90.2;
    public void convert()
    {
        double rs=euro*conamt;
        System.out.println(euro+" value in Rs is "+rs);
    }
    
}
