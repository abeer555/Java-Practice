import java.util.*;
public class RRemove
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int k=sc.nextInt();
        int a[]=new int[k],c=0;
        System.out.println("Enter elements");
        for(int i=0;i<k;i++)
            a[i]=sc.nextInt(); 
        System.out.println("Enter element to be removed");
        int r=sc.nextInt();
        for(int i=0;i<k;i++) {
            if(a[i]==r)
                c++;
        }
        int b[]=new int[k-c];
        for(int i=0,j=0;i<k;i++) {
            if(a[i]==r)
                continue;
            else {
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<k-c;i++)
            System.out.print(b[i]+" ");
    }
}