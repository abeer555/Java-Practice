import java.util.*;
public class comb3
{
    public static void main() {
        System.out.println("Enter a three letter word");
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),p="";
        for(int i=0;i<3;i++) {
            for(int j=i;j<i+3;j++) 
                p+=a.charAt(j>=3?j-3:j);
            System.out.println(p);
            for(int k=2;k>=0;k--) 
                System.out.print(p.charAt(k));
            System.out.println();
            p="";
        }
    }
}