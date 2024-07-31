import java.util.Scanner ;
class diagnol {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4] ;
        System.out.println("your array is in order of 4*4");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print("Enter ["+i+"]["+j+"] element of integer array : "); 
                a[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }
        int ld=0,rd=0;
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                if(i==j)
                    ld+=a[i][j];
        for(int i=0;i<4;i++)
            for(int j=3;j>=0;j--)
                if(i+j==3)
                    rd+=a[i][j];
        System.out.println("left diagnol = "+ld);
        System.out.println("right diagnol = "+rd);
    }
}