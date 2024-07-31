import java.util.*;
public class ArrSwap
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int i=0;i<=3;i++) 
            for(int j=0;j<=3;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Original array : ");
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        int temp;
        for(int k=0;k<=3;k++) {  
            temp=arr[0][k];
            arr[0][k]=arr[3][k];
            arr[3][k]=temp;
        }
        System.out.println("Swaped array : ");
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++)
                   System.out.print(arr[i][j]+" ");
            System.out.println();
        }      
    }
}
