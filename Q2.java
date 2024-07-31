import java.util.*;
public class Q2{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[4][4],B=new int[4][4],C=new int[4][4];
        System.out.println("Enter elements of 1st matrix:");
        for(int i=0;i<4;i++) 
            for(int j=0;j<4;j++) 
                A[i][j]=sc.nextInt();
        System.out.println("Enter elements of 2nd matrix:");
        for(int i=0;i<4;i++) 
            for(int j=0;j<4;j++) {
                B[i][j]=sc.nextInt();
                C[i][j]=A[i][j]+B[i][j];
            }
        System.out.println("Sum:");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(C[i][j]+" ");
            System.out.println("");
        }
    }
}