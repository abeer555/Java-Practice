import java.util.*;
public class charConvert {
    public static void mian() {
        Scanner sc=new Scanner(System.in);
        int j=0,l=0,f=0;
        String o=sc.nextLine().toUpperCase(),a="",b="",c="",d;
        if(o.indexOf('.')!=-1) {
            a=o.substring(0,o.indexOf('.'));
            if(o.substring(o.indexOf('.')+1).indexOf('.')!=-1)
                b=o.substring(o.indexOf('.')+1,o.length()-1);
            else if(o.substring(o.indexOf('.')+1).indexOf('?')!=-1)
                b=o.substring(o.indexOf('.')+1,o.length()-1);
            else if(o.substring(o.indexOf('.')+1).indexOf('!')!=-1)
                b=o.substring(o.indexOf('.')+1,o.length()-1);
        } else if(o.indexOf('?')!=-1) {
            a=o.substring(0,o.indexOf('?'));
            if(o.substring(o.indexOf('?')+1).indexOf('.')!=-1)
                b=o.substring(o.indexOf('?')+1,o.length()-1);
            else if(o.substring(o.indexOf('?')+1).indexOf('?')!=-1)
                b=o.substring(o.indexOf('?')+1,o.length()-1);
            else if(o.substring(o.indexOf('?')+1).indexOf('!')!=-1)
                b=o.substring(o.indexOf('?')+1,o.length()-1);
        } else if(o.indexOf('!')!=-1) {
            a=o.substring(0,o.indexOf('!')+1);
            if(o.substring(o.indexOf('!')+1).indexOf('.')!=-1)
                b=o.substring(o.indexOf('!')+1,o.length()-1);
            else if(o.substring(o.indexOf('!')+1).indexOf('?')!=-1)
                b=o.substring(o.indexOf('!')+1,o.length()-1);
            else if(o.substring(o.indexOf('!')+1).indexOf('!')!=-1)
                b=o.substring(o.indexOf('!')+1,o.length()-1);
        }
        System.out.println(a+"\n"+b);
        if(a!=""&&b!=""){
            a+=" ";b+=" ";
            System.out.println("COMMON WORDS\tFREQUENCY");
            for(int i=0;i<a.length();i++) {
                if(a.charAt(i)==(' ')){
                    for(int k=0;k<b.length();k++) {
                        if(b.charAt(k)==(' ')){
                            c=a.substring(j,i).trim();
                            d=b.substring(l,k).trim();
                            l=k;
                            if(c.equals(d)) 
                                f++;
                        }
                    }
                    j=i;
                    l=0;
                }
                if(f>=1)
                    System.out.println(c+"\t\t"+(++f));
                f=0;
            }
        }
        else
            System.out.println("INVALID INPUT");
    }
}