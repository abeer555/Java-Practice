import java.util.*;
public class SelectionSort
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int k=sc.nextInt(),temp,i;
        int a[]=new int[k];
        for(i=0;i<k;i++) {
            System.out.print("Enter the element ["+i+"] : ");
            a[i]=sc.nextInt();
        }
        int l=a.length,min=0;
        for(i=0;i<l;i++){
            for(int j=i+1;j<l;j++) 
                if(a[i]>a[j])  {  
                   temp=a[i];  
                   a[i]=a[j];  
                   a[j]=temp;  
                }  
        }
        for(i=0;i<l;i++)
            System.out.print(a[i]+" | ");
    }
}