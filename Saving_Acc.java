import java.util.*;
public class Saving_Acc
{
    static Scanner sc=new Scanner(System.in);
    static String name,type;
    static int acno;
    static float money,depo,draw,balance;
    public static void main() {
        System.out.print("Enter name            : ");
        name=sc.nextLine();
        System.out.print("Enter Account number  : ");
        acno=sc.nextInt();
        System.out.print("Enter balance         : ");
        Saving_Acc obj=new Saving_Acc(sc.nextInt());
        obj.display();
        obj.deposit();
        if(balance>1000) 
           obj.withdraw(); 
        else 
            System.out.println("Account balance is less than Rs.1000");
        obj.display();
    }
    Saving_Acc(int b) {
        balance=b;
        depo=0;
        draw=0;
    }
    void withdraw() {
        System.out.print("Enter amount to be withdrawn : ");
        draw=sc.nextInt();
        balance-=draw;
    }
    void deposit() {
        System.out.print("Enter amount to be deposited : ");
        depo=sc.nextInt();
        balance+=depo;
    }
    void display() {
        System.out.println("\nName            : "+name);    
        System.out.println("Account Number  : "+acno);
        System.out.println("Balance         : "+balance);
    }
}