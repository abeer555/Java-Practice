import java.util.*;
public class DoubleDimHighest
{
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int[][] arrI=new int[4][4];
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print("Enter ["+i+"]["+j+"] element of integer array : ");
                arrI[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int h=arrI[0][0],s=h;
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                if(h<arrI[i][j])
                    h=arrI[i][j];
                if(s>arrI[i][j])
                    s=arrI[i][j];
            }
        }
        System.out.println("Highest : "+h);
        System.out.println("Lowest  : "+s);
    }
}