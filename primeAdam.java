import java.util.*;
public class primeAdam {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("n = ");
        int n=sc.nextInt(),p,c,i,f=0;
        System.out.print("m = ");
        int m=sc.nextInt();
        if(n>m){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int j=n;j<=m;j++) {
            p=j;
            c=2;
            for (i = 2; i <= p / 2; i++) 
                if (p % i == 0)
                    c++;
            if (c==2) {
                if (rev(rev(p)*rev(p))==p*p) {
                    System.out.print(p + " ");
                    f++;
                }
            }
        }
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+f);
    }
    static int rev(int i) {
        int rev=0;
        while(i!=0){
            rev=rev*10+i%10;
            i/=10;
        }    
        return rev;
    }
}