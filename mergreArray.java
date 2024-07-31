import java.util.*;
public class mergreArray
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of 1st array : ");
        int s1=sc.nextInt();
        System.out.println("Enter "+s1+" elements");
        int a1[]=new int[s1],temp;
        for(int i=0;i<s1;i++) 
            a1[i]=sc.nextInt();
        System.out.print("Enter size of 2nd array : ");
        int s2=sc.nextInt();
        System.out.println("Enter "+s2+" elements");
        int a2[]=new int[s2];
        for(int i=0;i<s2;i++) 
            a2[i]=sc.nextInt();
        int m[]=new int[s1+s2];
        for(int i=0;i<s1;i++) 
            m[i]=a1[i];
        for(int i=0;i<s2;i++) 
            m[i+s1]=a2[i];
        for(int i=0;i<s1+s2-1;i++) {
            for(int j=0;j<s1+s2-1;j++) 
                if(m[j+1]<m[j]) {
                    temp=m[j+1];
                    m[j+1]=m[j];
                    m[j]=temp;
                }
        }
        System.out.print("1st Array : ");
        for(int i=0;i<s1;i++)
            System.out.print(a1[i]+" ");
        System.out.print("\n2nd Array : ");
        for(int i=0;i<s2;i++)
            System.out.print(a2[i]+" ");
        System.out.print("\nSorted Array : ");
        for(int i=0;i<s1+s2;i++)
            System.out.print(m[i]+" ");
    }
}