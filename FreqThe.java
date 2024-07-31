import java.util.*;
public class FreqThe
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int f=0;
        String s=" "+sc.nextLine().toLowerCase()+" ";
        for(int i=0;i<s.length()-4;i++)
            if(s.substring(i,i+5).equals(" the "))
                f++;
        System.out.println(f);
    }
}