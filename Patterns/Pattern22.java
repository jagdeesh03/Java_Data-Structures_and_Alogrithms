/* pattern using loop
E 
E D 
E D C 
E D C B 
E D C B A 

*/ 
import java.util.*;
public class Pattern22
{
public static void main(String[] args)
{
  int n = 5;
  pattern22(n);
}
static void pattern22(int n)
{


for(int row=0;row < n;row++)
 {
   int i=n-1;
   for(int column=0;column<=row;column++)
   {
        
        char ch=(char)('a'+i);
        System.out.print(Character.toUpperCase(ch)+" ");
        i--;
   }
   
  System.out.println();
 }
}
}
