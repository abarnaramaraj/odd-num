import java.util.*;
import java.lang.*;
public class Product
{
public static void main(String[] args)
{
int p,a,b=1;
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
while(p>0)
{
  a=p%10;
  p=p/10;
  b=a*b;
}
System.out.println(b);
}
}
