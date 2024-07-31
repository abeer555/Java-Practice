import java.util.*;
class H2B {
  
    // function to convert octal number
    // to its binary equivalent value
    public static String converter(String octalValue)
    {
  
        // parsing the string value
        // by following octal number system
        int octal = Integer.parseInt(octalValue, 16);
  
        // converting octal number to binary
        // and storing as a string
        String binaryValue = Integer.toBinaryString(octal);
  
        // returning the resultant string
        return binaryValue;
    }
  
    // Driver code
    public static void main()
    {
        String s=new Scanner(System.in).next();
        String[] arr=s.split("\\.");
        int[] intArr=new int[2];
        String octalNumber =arr[0];
        //System.out.println(s);
        // calling the converter method and
        // storing the result in a string variable
        String result = converter(octalNumber);
        while(result.length()%4!=0)
                result="0"+result;
       String a1="0";
        System.out.print(result);
        if(s.contains(".")){
            a1=arr[1];
        }
        result=converter(a1);
        while(result.length()%4!=0)
                result="0"+result;
                 System.out.print("."+result);
    
}
}