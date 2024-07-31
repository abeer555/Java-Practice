import java.util.*;
public class B2H
{
    public static void main() {
        String s=new Scanner(System.in).next();
        double d=Double.parseDouble(s);
        String[] arr=s.split("\\.");
        int[] intArr=new int[2];
        int a,quo,rem;
        String res="",resRev="";
        String a0=arr[0];
        
        while(arr[0].length()%4!=0)
            arr[0]=arr[0]+"0";
        
        
        //System.out.println(arr[0]+" "+arr[1]);
        for(int i=0,j=4;i<arr[0].length();i+=4,j+=4){
            System.out.print(arr[0].substring(i,j)+" ");
        }    
        
        if(s.contains(".")){
            String a1=arr[1];
            while(arr[1].length()%4!=0)
                arr[1]=arr[1]+"0";
            for(int i=0,j=4;i<arr[1].length();i+=4,j+=4){
                System.out.print(arr[1].substring(i,j)+" ");
            }
            System.out.print("\n"+convertBinarytoOctal(Long.parseLong(a0))+".");
            System.out.print(convertBinarytoOctal(Long.parseLong(arr[1])));
        }
        else
            System.out.print("\n"+convertBinarytoOctal(Long.parseLong(a0)));
      
    }
    public static String convertBinarytoOctal(long binaryNumber) {
       
        // variable to store the output of the
        // binaryToDecimal() method
        int decimalNumber = binaryToDecimal(binaryNumber);
 
        // converting the integer to the desired
        // hex string using toHexString() method
        String hexNumber= Integer.toHexString(decimalNumber);
 
        // converting the string to uppercase
        // for uniformity
        hexNumber = hexNumber.toUpperCase();
 
        // returning the final hex string
        return hexNumber;
       
}
static int binaryToDecimal(long binary)
    {
 
        // variable to store the converted
        // binary number
        int decimalNumber = 0, i = 0;
 
        // loop to extract the digits of the binary
        while (binary > 0) {
 
            // extracting the digits by getting
            // remainder on dividing by 10 and
            // multiplying by increasing integral
            // powers of 2
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
 
            // updating the binary by eliminating
            // the last digit on division by 10
            binary /= 10;
        }
 
        // returning the decimal number
        return decimalNumber;
    }
}