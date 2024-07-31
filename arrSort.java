import java.util.*;
public class arrSort
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
        for(int i=0;i<=3;i++) 
            for(int j=0;j<=3;j++)
                for(int k=0;k<=3;k++)
                    if(arr[i][j]<arr[i][k]){
                        temp=arr[i][j];
                        arr[i][j]=arr[i][k];
                        arr[i][k]=temp;
                    }
        System.out.println("Sorted array : ");
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++) 
                   System.out.print(arr[i][j]+" ");
            System.out.println();
        }      
    }
}