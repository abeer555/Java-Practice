import java.util.*;
public class D2B1 {    
    public static void main(){      
        String p="",s=new Scanner(System.in).next();
        int b=Integer.parseInt(s);
        int a=0;
        double d,t=0;
        while(b!=0){
            System.out.println(b/16);
            a=(a*10)+b%2;
            b/=2;
        }
        System.out.println(p);
        while(a!=0){ 
            b=b*10+(a%10);  
            a/=10;
        }
        System.out.println(b);
        Double decimal=new Scanner(System.in).nextDouble();
        for(int i=1;i<=10;i++) {
            d=decimal*2;
            System.out.println((decimal)+"*2"+"="+d);
            if(d>=1){
                d-=1.000;
                a=(a*10)+1;
            }
            else
                 a=(a*10);
            decimal=d;
        }
        System.out.println(a);
    }
}      