import java.util.*;
public class H2D
{
    public static void main() {
        String s=new Scanner(System.in).next().toUpperCase();
        double d=0;//Integer.parseInt(s,16);  
        String[] arr=s.split("\\.");
        //System.out.println(arr[0]);
        int[] intArr=new int[2];
        String decimal; 
        if(s.contains(".")){
            intArr[0]=Integer.parseInt(arr[0],16); 
            intArr[1]=Integer.parseInt(arr[1],16);
            decimal=arr[1];

        }
        else {
            intArr[0]=Integer.valueOf(Integer.parseInt(arr[0],16)); 
            intArr[1]=0;
            decimal="0";
        }
        int l=arr[0].length();
        //for(int i=0;i<arr[0].length();i++)
            //if(s.charAt(i)=='A')
                //l--;
        double b=0;
        int pos;
        //System.out.println(arr[0]+" "+arr[1]);
        for(int i=0,j=l-1;j>=0;i++,j--){
            if(i==s.length())
            break;
            pos=Character.getNumericValue(s.charAt(i));
            d=pos*Math.pow(16,j);
            System.out.println(pos+" * 16"+superscript(String.valueOf(j))+" = "+(int)d);
            b+=d;
        }
        //System.out.println(decimal);
        if(intArr[1]!=0)
        for(int i=-1,j=0;j<decimal.length();i--,j++) {
            d=Character.getNumericValue(decimal.charAt(j))*Math.pow(16,i);
            System.out.println(Character.getNumericValue(decimal.charAt(j))+" * 16"+superscript(String.valueOf(i))+" = "+d);
            b=b+d;
        }
        System.out.println(b);
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