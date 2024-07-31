import java.util.*; 
public class Comb3L2 { 
    public static void main(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a three letter word : "); 
        String s = sc.next(); 
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                for (int k=0;k<3;k++) 
                    if(i!=j&&i!=k&&j!=k) 
                        System.out.print(""+s.charAt(i)+s.charAt(j)+s.charAt(k)+" ");
    }
}