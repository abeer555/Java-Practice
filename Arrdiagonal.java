import java.util.*;
public class Arrdiagonal
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in 4*4 matrix : ");
        int arr[][]=new int[4][4];
        for(int i=0;i<=3;i++)
            for(int j=0;j<=3;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Original Array : ");
        int ud=0,dd=0;
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++) {
                if(j>i)
                    ud+=arr[i][j];
                else if(j<i)
                    dd+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of element above diagonal "+ud);
        System.out.println("Sum of element below diagonal "+dd);
    }
}