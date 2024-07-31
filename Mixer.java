import java.util.*;
public class Mixer
{
    int n;
    int arr[];
    static Scanner sc=new Scanner(System.in);
    public static void main() {
        System.out.println("Enter size of array 1");
        Mixer obj1=new Mixer(sc.nextInt());
        obj1.accept();
        System.out.println("Enter size of array 2");
        Mixer obj2=new Mixer(sc.nextInt());
        obj2.accept();
        Mixer obj3;
        obj3=obj1.mix(obj2);
        obj3.display();
        }
    Mixer(int nn) {
        n=nn;
        arr=new int[n];
    }
    void accept() {
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    Mixer mix(Mixer obj) {
        Mixer temp=new Mixer(n+obj.n);
        System.out.println(n);
        int i;
        for(i=0;i<n;i++)
            temp.arr[i]=arr[i];
        for(int j=0;j<obj.n;j++,i++)
            temp.arr[i]=obj.arr[j]; 
        return temp;
    }
    void display() {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
