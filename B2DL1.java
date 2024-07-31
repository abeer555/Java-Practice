import java.util.*;
public class B2DL1
{
    public static void main() {
        long a=new Scanner(System.in).nextLong();
        int int1=(int)Math.floor(a);
        String s=Integer.toString(int1);
        System.out.println(s);
        double b=0,d=0.0;
        if(int1!=0)
            b=1;
        for(int i=1;i<s.length();i++){
            System.out.print("(2*"+b+")+"+s.charAt(i)+"= ");
            b=(b*2)+Character.getNumericValue(s.charAt(i));
            System.out.println(b);
        }
        String decimal=new Scanner(System.in).next();
        System.out.println(decimal);
        for(int i=-1,j=0;j<decimal.length();i--,j++) {
            d=Character.getNumericValue(decimal.charAt(j))*Math.pow(2,i);
            if(d!=0)
            System.out.println(decimal.charAt(j)+"*2^"+i+"="+d);
            b=b+d;
        }
        System.out.println(b);
    }
}