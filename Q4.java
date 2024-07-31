import java.util.*;
public class Q4
{
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3],temp,sum=0,r[][]=new int[3][3];
        for(int i=0;i<3;i++) 
            for(int j=0;j<3;j++) 
                a[i][j]=sc.nextInt();
        System.out.println("Original marix : ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+"\t");
                r[j][2-i]=a[i][j];
            }
            System.out.println();
        }
        System.out.println("Rotated matrix : ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(r[i][j]+"\t");
                if(i==0||j==0||i==3-1||j==3-1)
                    sum+=r[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of the corner elements = "+sum);
    }
}