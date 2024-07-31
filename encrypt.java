import java.util.*;
public class encrypt
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),s2=s.toLowerCase(),e="";
        char c;
        for(int i=0;i<s.length();i++) {
            c=s2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                e+=Character.toString(s.charAt(i)+2);
            else if(c=='z')
                e+=Character.toString(s.charAt(i)-25);
            else 
                e+=Character.toString(s.charAt(i)+1);
        }
        System.out.println(e);
    }
}