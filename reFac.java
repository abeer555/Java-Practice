import java.util.*;
public class reFac
{
    public static void main() {
        System.out.println(sum(10));
    }
    static int sum(int n) {
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
}