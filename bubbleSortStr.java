import java.util.*;
public class bubbleSortStr
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        char c=' ';
        String a=sc.nextLine(),s2="";
        int l=a.length();
        String b[]=new String[l],temp;
        for(int i=0;i<a.length();i++) 
            b[i]=Character.toString(a.charAt(i));
        for(int i=0;i<l-1;i++) {
            for(int j=0;j<l-1;j++) 
                if(!(b[j+1].equalsIgnoreCase(b[j]))) 
                if(b[j+1].compareTo(b[j])<0) {
                    temp=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp;
                }
        }
        for(int i=0;i<l;i++)
            System.out.print(b[i]);
    }
}