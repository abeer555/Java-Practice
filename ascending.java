import java.util.*;
public class ascending
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        char c;
        String a=sc.nextLine(),s2="";
        for(c='A';c<='Z';c++)
            if(a.contains(Character.toString(c)))
                s2+=Character.toString(c);
            else if(a.contains(Character.toString(c).toLowerCase()))
                s2+=Character.toString(c).toLowerCase();
        System.out.println(s2);
    }
}