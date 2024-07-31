import java.util.*;
public class BouncyNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        if(num.length()<=2) {
            System.out.println("A number below 100 can never be a Bouncy number.");
            return;
        }
        int a=num.charAt(0),i;
        for(i=1;i<num.length();i++) 
            if(a>num.charAt(i)) 
                break;
        if(i==num.length())
            System.out.println("It is not a Bouncy number because the digits are sorted in ascending order.");
        else{
            for(i=1;i<num.length();i++) {
                if(a<num.charAt(i))
                    break;
            }
            if(i==num.length())
                System.out.println("It is not a Bouncy number because the digits are sorted in descending order.");
            else
                System.out.println("It is a Bouncy number because the digits are unsorted.");
        }
    }
}
