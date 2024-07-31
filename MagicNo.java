import java.util.*;
public class MagicNo {
    static int sum=0;
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),count=2;
        if(c(a)==1){
            for(int i=2;i<=a/2;i++)
                if(a%i==0)
                    count++;
            if(count>2)
                System.out.println("Composite Magic number");
        }
    }
    static int c(int temp) {
        while(temp!=0) {
            sum+=temp%10;
            temp/=10;
        }
        temp=sum;
        if(sum>=10) {
            sum=0;
            c(temp);
        }
        return sum;
    }
}