import java.util.*;
public class aToAn
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String A=sc.nextLine(),a="";
        A+=" ";
        int i=0,j=A.indexOf(' ');
        while(j!=-1) {
            if(A.substring(i,j).equals("a"))
                a+="an"+" ";
            else
                a+=A.substring(i,j)+" ";
            i=j+1;
            j=A.indexOf(' ',i);
        }
        System.out.println(a);
    }
}