package p9;

public class bytes implements compute
 {
    double gb;
    bytes(double g)
    {
        gb=g;
    }
    final double cov=1024;
    public void convert()
    {
        double bytes=gb*Math.pow(cov, 3);
        System.out.println(gb+" is equivalent to "+bytes);
    }
    
}
