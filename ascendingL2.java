import java.util.* ;
class ascendingL2
{
    static void main ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String m ="",a=sc.next();
        for(char j = 'A' ; j <= 'Z' ;j++)
            for(int i = 0 ; i < a.length() ; i++)
                if((j==a.charAt(i))||(j+32)==a.charAt(i))
                    m+=a.charAt(i);
        System.out.println("Alphabetical order of given word = "+m);
    }
}