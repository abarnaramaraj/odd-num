import java.util.*;
import java.lang.*;
public class Oddnum
{
public static void main(String[] args)
{
int a,b,x,i,count=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(i=0;i<=b;i++)
{
x=sc.nextInt();
if(x%2!=0)
{
count=count+1;
if(count==b)
{
System.out.println(x);
}
}
}
}
}
