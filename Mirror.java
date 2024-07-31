import java.util.*;
public class Mirror
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in 4*4 matrix : ");
        int arr[][]=new int[4][4];
        for(int i=0;i<=3;i++)
            for(int j=0;j<=3;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Original Array : ");
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
       
        System.out.println("Mirrored Array : ");
        for(int i=0;i<=3;i++) {
            System.out.println();
            for(int j=3;j>=0;j--)
                System.out.print(arr[i][j]+" ");
        }
    }
}