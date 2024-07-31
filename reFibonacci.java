public class reFibonacci  
{
      public static void main() {
        int i=0,j=1;
        System.out.println(r(i,j));
    }
    static int r(int i,int j)  {
        System.out.print(i+" "+j+" ");
        if(i>10000)
            return (i+j);
        return r(i+=j,j+=i);
    }
}