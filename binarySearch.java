import java.util.*;
public class binarySearch
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int k=sc.nextInt(),mid;
        boolean flag=false;
        int a[]=new int[k];
        System.out.println("Enter elements");
        for(int i=0;i<k;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter element to be searched");
        int l=0,u=k,n=sc.nextInt();
        while(l<=u){
            mid=(l+u)/2;
            if(a[mid]==n){
                flag=true;
                break;
            }
            else if(a[mid]>n)
                u=mid-1;
            else 
                l=mid+1;
        }
        System.out.println(flag);
    }
}