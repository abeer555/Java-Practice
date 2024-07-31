import java.util.*;
public class evil
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to check");
        int a=sc.nextInt(),j=1;
        long b=0;
        while(a!=0){
            b+=(a%2)*j;
            a/=2;
            j*=10;
        }
        j=0;
        System.out.println("Binary equivalent : "+b);
        while(b!=0){
            if(b%10==1)
                j++;
            b/=10;
        }
        if(j%2==0)
            System.out.println("Evil no.");
        else
            System.out.println("Not an evil no."); 
    }
}