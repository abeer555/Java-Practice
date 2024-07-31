import java.util.*;
public class Boundry {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("M = ");
        int m=sc.nextInt();
        System.out.print("N = ");
        int n=sc.nextInt(),arr[][]=new int[m][n],a,temp;
        if(n>2&&n<8&&m>2&&m<8) {
            System.out.println("ENTER ELEMENTS OF MATRIX");
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++) 
                    arr[i][j]=sc.nextInt();
            System.out.println("ORIGINAL MATRIX");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
            System.out.println("SUM OF THE BOUNDRY ELEMENTS(UNSORTED) = "+sum(m,n,arr));
            System.out.println("SORTED MATRIX");
            a=arr[0][0];
            for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    if(arr[i][j]<a) {
                        temp=a;
                        a=arr[i][j];
                        arr[i][j]=temp;
                    }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
            System.out.println("SUM OF THE BOUNDRY ELEMENTS(SORTED) = "+sum(m,n,arr));            
        }
        else
            System.out.println("OUT OF RANGE");
    }
    static int sum(int m,int n,int arr[][]) {
        int sum=0;
        for(int i=0;i<m;i++)
                for(int j=0;j<n;j++)
                    if(i==0||j==0||i==m-1||j==n-1)
                        sum+=arr[i][j];
        return sum;
    }
}