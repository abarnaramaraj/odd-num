import java.util.*;
import java.lang.*;
public class Odd5
{
public static void main(String[] args)
{
int t,s,x,i,count=0;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
s=sc.nextInt();
for(i=0;i<t;i++)
{
x=sc.nextInt();
if(x%2!=0)
{
count=count+1;
if(count==s)
{
System.out.println(x);
}
}
}
}
}
