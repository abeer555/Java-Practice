import java.util.*;
public class FacinatingNo {
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int a,m2,m3,d=0,f=0;
        String c,b;
        System.out.print("n = ");
        int n=sc.nextInt();
        System.out.print("m = ");
        int m=sc.nextInt();
      if(n>99&&m<10000) {
        System.out.println("THE FACINATING NUMBERS ARE : ");
        for(int j=n;j<=m;j++) {
            a=j;
            m2=a*2;m3=a*3;d=0;
            c=(a+""+m2+""+m3).replace("0","");b="";
            if(c.length()==9) {
                for(int i=1;i<=9;i++){
                    b=String.valueOf(i);
                    if(c.indexOf(b)==-1)
                        break;
                    else    
                        d++;
                }
                if(d==9) {   
                    System.out.print(a+" ");
                    ++f;
                }
            }
        }
        if(f==0)
            System.out.print("NIL");
        System.out.print("\nFREQUENCY OF FACINATING NUMBER IS : "+f);
      }
      else 
          System.out.println("INVALID INPUT");
    }
}