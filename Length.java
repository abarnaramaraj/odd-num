import java.util.*;
import java.lang.*;
public class Length
{
public static void main(String[] args)
{
String str ;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println(i);
}
}
