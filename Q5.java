import java.util.*;
public class Q5
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[4][4];
        for(int i=0;i<4;i++) 
            for(int j=0;j<4;j++) 
                a[i][j]=sc.nextInt();
        int h=a[0][0],s=h;
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(a[i][j]+"\t");
                if(h<a[i][j])
                    h=a[i][j];
                if(s>a[i][j])
                    s=a[i][j];
            }
            System.out.println();
        } 
        System.out.println("The lowest number in the array is "+s);
        System.out.println("The greatest number in the array is "+h);
    }
}