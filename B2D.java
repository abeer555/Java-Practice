import java.util.*;
public class B2D
{
    public static void main() {
        double d=new Scanner(System.in).nextDouble();
        String[] arr=String.valueOf(d).split("\\.");
        //System.out.println(arr[0]+" "+arr[1]);
        int[] intArr=new int[2];
        if(arr[1].contains("E")){
            intArr[0]=(int)d; 
            intArr[1]=0; 
        }
        else {
            intArr[0]=Integer.parseInt(arr[0]); 
            intArr[1]=Integer.parseInt(arr[1]);
        }
        int i,j,a = intArr[0];
        int dec = intArr[1];
        String s=Integer.toString(a);
        double b=0,da;
        double arr1[]=new double[String.valueOf(d).length()];
        for(i=0,j=s.length()-1;i<s.length();i++,j--){
            da=Character.getNumericValue(s.charAt(i))*Math.pow(2,j);
            System.out.println(s.charAt(i)+" * 2"+superscript(String.valueOf(j))+"  = "+(int)da);
            b+=da;
            arr1[i]=(int)da;
        }
        int k=i;
        String decimal=String.valueOf(dec);
        if(intArr[1]!=0)
        for(i=-1,j=0;j<decimal.length();i--,j++,k++) {
            da=Character.getNumericValue(decimal.charAt(j))*Math.pow(2,i);
            System.out.println(decimal.charAt(j)+" * 2"+superscript(String.valueOf(i))+" = "+da);
            b+=da;
            arr1[k]=da;
        }
        for(i=0;i<arr1.length;i++)
        if(arr1[i]!=0.0)
            System.out.print(arr1[i]+"  ");
        System.out.println(" = "+b);
    }
    public static String superscript(String str) {
        str = str.replaceAll("-", "⁻");
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");       
        return str;
    }
    
}