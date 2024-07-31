import java.util.*;
public class DoubleDim
{
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int[][] arrI=new int[3][3];
        String[][] arrS=new String[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("Enter ["+i+"]["+j+"] element of integer array : ");
                arrI[i][j]=sc.nextInt();
                System.out.print("Enter ["+i+"]["+j+"] element of string array : ");
                arrS[i][j]=sc.next();
            }
            System.out.println();
        }
        System.out.println("\nInteger array : ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) 
                System.out.print("|"+arrI[i][j]+"|");
            System.out.println();
        }
        System.out.println("\nString array : ");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) 
                System.out.print("|"+arrS[i][j]+"|");
            System.out.println();
        }
    }
}