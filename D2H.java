import java.util.*;
public class D2H
{
    public static void main() {
        String s=new Scanner(System.in).next();
        double d=Double.parseDouble(s);
        String[] arr=String.valueOf(d).split("\\.");
        int[] intArr=new int[2];
        int a,quo,rem;
        String res="",resRev="",srem;
        if(arr[1].contains("E")){
            intArr[0]=(int)d; 
            intArr[1]=0; 
        }
        else {
            intArr[0]=Integer.parseInt(arr[0]);
            intArr[1]=Integer.parseInt(arr[1]);
        }
        //System.out.println(intArr[0]+" "+intArr[1]);
        System.out.println("\t\tQuotient\tRemainder");
        quo=intArr[0];
        while(quo!=0) {
            System.out.print("("+quo+")/16     \t");
            rem=quo%16;
            if(rem==10||rem==11||rem==12||rem==13||rem==14||rem==15||rem==16){
                srem=Integer.toHexString(rem).toUpperCase();
                System.out.println(quo+"       \t"+rem);
                res+=srem;
            }else{
                System.out.println(quo+"       \t"+rem);
                res+=rem+"";
            }
            quo/=16;
            
        }
        for(int i=res.length()-1;i>=0;i--)
            resRev+=res.charAt(i);
        String arr1[];
        int l=1;
        String decimal="";
        if(s.contains(".")){
            for(int i=0;i<arr[1].length();i++)
               l*=10;
            double dec=Double.valueOf("0."+arr[1]);
            d=dec;
            for(int i=0;i<10;i++) {
                d=Math.round(d * 1000.0) / 1000.0;
                System.out.print(d+" * 16 = "+(d*16));
                d*=16;
                if(d==1.0)
                    break;
                
                if(d<1.0){
                    
                    decimal+="0";
                    System.out.println("\t\t0");
                }
                if(d>1.0){
                    arr1=String.valueOf(d).split("\\.");
                    //arr1[1]="0."+arr[1];
                    if(d>=10)
                        decimal+=Integer.toHexString((int)d).toUpperCase();
                    else
                        decimal+=arr1[0];
                    d=Double.valueOf(arr1[1])/l;
                    System.out.println("\t\t"+arr1[0]);
                }
                if(i==10)
                    break;
            }
            System.out.println(resRev+"."+decimal);
        }
        else
            System.out.println(resRev);
    }
}