import java.util.*;
import java.lang.*;
public class Small
{
public static void main(String[] args)
{
int p,s,x,i,count=0;
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
s=sc.nextInt();
for(i=0;i<p;i++)
{
x=sc.nextInt();


count=count+1;
if(count==s)
{
System.out.println(x);
}
}
}
}
