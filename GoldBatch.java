import java.util.*;
public class GoldBatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N = ");
        int N=sc.nextInt();
        if(N<9&&N>50) {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            return;
        }else if(N%2!=0){
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            return;
        }
        System.out.println("PRIME PAIRS ARE :");
        for(int i=5;i<=N/2;i+=2)
            if(primeCheck(i)==true&&primeCheck(N-i)==true)
                System.out.println(i+", "+(N-i));
    }
    static boolean primeCheck(int n){
        int c=2;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                c++;
        return(c==2?true:false);
    }
}
