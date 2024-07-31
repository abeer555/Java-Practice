public class check{
public static void main() {
check obj=new check() ;
System.out.println(obj.find(8,36));
}
int find(int n1, int n2)
{
if(n1==n2)
return(1);
else
if(n1>n2)
n1=n1-n2;
else
if(n2>n1)
n2 = n2-n1;
return(find(n1, n2));
}
}