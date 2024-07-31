import java.util.*; 
public class FacinatingNoL2 {
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int d=0,f=0;
        String c;
        System.out.print("n = ");
        int n=sc.nextInt();
        System.out.print("m = ");
        int m=sc.nextInt();
        if(n>99&&m<10000) {
            System.out.println("THE FACINATING NUMBERS ARE : ");
            for(int j=n;j<=m;j++) {
                d=0;
                c=(j+""+j*2+""+j*3).replace("0","");
                if(c.length()==9) {
                    for(int i=1;i<=9;i++)
                        if(c.indexOf(String.valueOf(i))==-1)
                            break;
                        else    
                            d++;
                    if(d==9) {   
                        System.out.print(j+" ");
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