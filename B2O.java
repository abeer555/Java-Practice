import java.util.*;
public class B2O
{
    public static void main() {
        String s=new Scanner(System.in).next();
        double d=Double.parseDouble(s);
        String[] arr=s.split("\\.");
        int[] intArr=new int[2];
        int a,quo,rem;
        String res="",resRev="";
        while(arr[0].length()%3!=0)
            arr[0]="0"+arr[0];
        
        
        //System.out.println(arr[0]+" "+arr[1]);
        for(int i=0,j=3;i<arr[0].length();i+=3,j+=3){
            System.out.print(arr[0].substring(i,j)+" ");
        }    
        
        if(s.contains(".")){
            while(arr[1].length()%3!=0)
                arr[1]=arr[1]+"0";
            for(int i=0,j=3;i<arr[1].length();i+=3,j+=3){
                System.out.print(arr[1].substring(i,j)+" ");
            }
            System.out.print("\n"+convertBinarytoOctal(Long.parseLong(arr[0]))+".");
            System.out.print(convertBinarytoOctal(Long.parseLong(arr[1])));
        }
        else
            System.out.print("\n"+convertBinarytoOctal(Long.parseLong(arr[0])));
    }
    
    public static int convertBinarytoOctal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, i = 0;
        
        while (binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }
            
        i = 1;
        
        while (decimalNumber != 0) {
                octalNumber += (decimalNumber % 8) * i;
                decimalNumber /= 8;
                i *= 10;
            }
            
        return octalNumber;
  }
}