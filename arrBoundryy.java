import java.util.*;
public class arrBoundryy
{
    public static void main() {
        System.out.println("Enter elements in 3*3 matrix");
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=2;i++)
            for(int j=0;j<=2;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Entered array");
        for(int i=0;i<=2;i++) {
            for(int j=0;j<=2;j++)
                System.out.print(arr[i][j]+"    ");
            System.out.println();
            }
        int bo=0,unbo=0;
        for(int i=0;i<=2;i++)
            for(int j=0;j<=2;j++)
                if(i==0||j==0||i==2||j==2)
                    bo+=arr[i][j];
                else
                    unbo+=arr[i][j];
        System.out.println("Sum of boundry elements : "+ bo);
        System.out.println("Sum of non boundry elements : "+ unbo);
    }
}
