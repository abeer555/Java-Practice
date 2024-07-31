import java.util.*;
public class Q3{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        char[][] A=new char[3][3];
        for(int i=0;i<3;i++) 
            for(int j=0;j<3;j++) 
                A[i][j]=sc.next().charAt(0);
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++)
                System.out.print(A[i][j]+" ");
            System.out.println("");
        }
        System.out.println("The left diagonal elements are "+A[0][0]+","+A[1][1]+","+A[2][2]+".");
        System.out.println("The right diagonal elements are "+A[0][2]+","+A[1][1]+","+A[2][0]+".");
    }
}
