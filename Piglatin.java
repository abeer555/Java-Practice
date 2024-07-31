import java.util.*;    
class Piglatin {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word ");
        String s1=sc.nextLine(),s=s1.toLowerCase();
        int i;
        char ch;
        for(i=0; i<s.length(); i++) {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                break;
        }
        String p=s1.substring(i)+s1.substring(0,i)+"AY";
        System.out.println("The Piglatin of the word = "+p);
    }
}