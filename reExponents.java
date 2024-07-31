public class reExponents
{
    public static void main() {
        System.out.println(reEx(3,4));
    }
    static int reEx(int a, int b){
        if(b==0)
            return 1;
        return a*reEx(a,b-1);
    }
}