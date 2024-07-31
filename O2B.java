import java.util.*;
class O2B {
  
    // function to convert octal number
    // to its binary equivalent value
    public static String converter(String octalValue)
    {
  
        // parsing the string value
        // by following octal number system
        int octal = Integer.parseInt(octalValue, 8);
  
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
        double d=Double.parseDouble(s);
        String[] arr=s.split("\\.");
        int[] intArr=new int[2];
        String octalNumber =arr[0];
  String a1="0";
        
        if(s.contains(".")){
            a1=arr[1];
        }
        // calling the converter method and
        // storing the result in a string variable
        String result = converter(octalNumber);
  while(result.length()%3!=0)
                result="0"+result;
        // printing the binary equivanlent value
        System.out.print(result);
        result=converter(a1);
        while(result.length()%3!=0)
                result="0"+result;
                 System.out.print("."+result);
    }
}