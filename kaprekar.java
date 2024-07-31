import java.util.*;
public class kaprekar
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("p = ");
        int p=sc.nextInt();
        System.out.print("q = ");
        int q=sc.nextInt();
        String s;
        int f=0;
        double a,b;
        System.out.print("Kaprekar's numbers are ");
        if(p>q) 
            return;
        for(int i=p;i<=q;i++) {
            s=String.valueOf(i*i);
            if(s.length()==1) {
                a=Math.pow(Integer.valueOf(s),2);
                b=0;
            }
            else if(s.length()%2!=0)
                continue;
            else {
                a=Integer.valueOf(s.substring(0,s.length()/2));
                b=Integer.valueOf(s.substring(s.length()/2,s.length()));
            }
            if(i==(a+b)) {
                System.out.print(i+",");
                f++;
            }
        }
        System.out.println("\nFrequency of Kaprekar's number : "+f);
    }
}