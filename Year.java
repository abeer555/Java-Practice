import java.util.*;
public class Year
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day of year : ");
        int day=sc.nextInt(),date=0;
        System.out.print("Enter year : ");
        int year=sc.nextInt(),feb=28,m=1;
        if(year%4==0&&year%400!=0)
            feb=29;
        if(day<31)
            date=day;
        else if(day<31+feb) {
            date=day-31;
            m=2;
        }else{
            int l=31+feb;
            m=3;
            for(int i=1;i<=10;i++) {
               m++;
                l+=(i%2==0?30:31);
               if(day<l) {
                   continue;
               } else {
                   date=day-l;
                   if(date>31)
                    continue;
                   break;
                }
               }
            }
        System.out.print(date);
        switch (date) {
            case 31: System.out.print("st");break;
            case 1: System.out.print("st");break;
            case 21: System.out.print("st");break;
            case 2: System.out.print("nd");break;
            case 22: System.out.print("nd");break;
            case 3: System.out.print("rd");break;
            case 23: System.out.print("rd");break;
            default: System.out.print("th");break;
        }
        System.out.print(" ");
        switch(m) {
            case 1:System.out.print("January"); break;
            case 2:System.out.print("February"); break;
            case 3:System.out.print("March"); break;
            case 4:System.out.print("April"); break;
            case 5:System.out.print("May");break;
            case 6: System.out.print("June");  break;
            case 7:System.out.print("July"); break;
            case 8:System.out.print("August"); break;
            case 9:System.out.print("September"); break;    
            case 10:System.out.print("October"); break;    
            case 11:System.out.print("November"); break;
            case 12:System.out.print("December");  break;    
        }
        System.out.print(", "+year);
    }
}

