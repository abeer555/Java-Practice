import java.util.*;
public class Q1
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][3],ld=0,rd=0;
        for(int i=0;i<3;i++) 
            for(int j=0;j<3;j++) 
                A[i][j]=sc.nextInt();
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i==j)
                    ld+=A[i][j];
                if(i+j==2)
                    rd+=A[i][j];
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        } 
        System.out.println("Sum of the left diagonal elements("+A[0][0]+"+"+A[1][1]+"+"+A[2][2]+") = "+ld);
        System.out.println("Sum of the right diagonal elements("+A[0][2]+"+"+A[1][1]+"+"+A[2][0]+") = "+rd);
    }
}