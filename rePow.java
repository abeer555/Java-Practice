public class rePow
{
    public static void main() {
        System.out.println(pow(10,2));
    }
    static int pow(int n,int p) {
        if(p==0)
            return 1;
        return n*pow(n,p-1);
    }
}