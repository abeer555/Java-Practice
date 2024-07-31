import java.util.*;
public class CaesarCipher
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),e="";
        if(s.length()<=3||s.length()>100)
            System.out.println("Out of range");
        else
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if((c>='A'&&c<'N')||(c>='a'&&c<'n'))
                e+=Character.toString(c+13);
            else if((c>='N'&&c<='Z')||(c>='n'&&c<='z'))
                e+=Character.toString(c-13);
            else 
                e+=c;
        }
        System.out.println(e);
    }
}