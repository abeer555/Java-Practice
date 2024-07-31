public class rePowL2
{
    public static void main() {
        System.out.println(pow(10,2));
    }
    static int pow(int n,int p) {
        if(p==0)
            return 1;
        if(p%2==0)
            return n*pow(n*n,p/2);
        return n*pow(n,p-1);
    }
}