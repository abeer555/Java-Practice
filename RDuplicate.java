import java.util.*;
public class RDuplicate
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int k=sc.nextInt();
        int a[]=new int[k],c=0;
        int b[]=new int[k];
        System.out.println("Enter elements");
        for(int i=0;i<k;i++)
            a[i]=sc.nextInt(); 
        for(int i=0;i<k;i++) 
            for(int j=0;j<k;j++) {
                if(j==i)
                    break;
                if(a[i]!=a[j]){
                   b[i]=a[i];
                }
            }
        for(int i=0;i<k;i++)
            if(b[i]==0)
                c++;
        int d[]=new int[k-c];
        for(int i=0,j=0;i<k;i++) {
            if(b[i]==0)
                continue;
            else {
                d[j]=b[i];
                j++;
            }
        }
        for(int i=0;i<k-c;i++)
            System.out.print(d[i]+" ");
    }
}