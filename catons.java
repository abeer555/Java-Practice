import java.util.*;
public class catons {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt(),n=N,c=0;
        if (n<1||n>1000) {
            System.out.println("INVALID INPUT");
            return;
        }
        for(int i=48;i>=6;i/=2)
            if (N / i != 0) {
                c+=N/i;
                System.out.println(i + " * " + N / i + " = " + (i*N/i));
                N -= N / i * i;
            }
        System.out.println("Remaining boxes = "+(N==0?"0":N+" * 1 = "+N));
        System.out.println("Total number of boxes = "+n);
        System.out.println("Total number of cartons = "+(N==0?c:(++c)));
    }
}