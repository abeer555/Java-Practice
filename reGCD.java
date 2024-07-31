public class reGCD
{
    static int i=1,g=1;
    public static void main() {
        System.out.println(gcd(4,10));
    }
    static int gcd(int a,int b) {
        i++;
        if((a%i==0)&&(b%i==0))
            g=i;
        if(i>a||i>b)
            return g;
        return gcd(a,b);
    }
}