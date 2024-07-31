import java.util.*;
public class paliWord
{
    public static void main() {
        System.out.println("Enter a word");
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),p="";
        for(int i=a.length()-1;i>=0;i--)
            p+=a.charAt(i);
        if(p.equals(a))
            System.out.println("Palindrome");
    }
}