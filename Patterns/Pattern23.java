/* pattern using loop
E D C B A 
D C B A 
C B A 
B A 
A 


*/ 
import java.util.*;
public class Pattern23
{
public static void main(String[] args)
{
  int n = 5;
  pattern23(n);
}
static void pattern23(int n)
{
for(int row=0;row < n;row++)
 {
   int num = (n-row-1);
   for(int column=0;column<(n-row);column++)
   {
        char ch=(char)('a'+num);
        System.out.print(Character.toUpperCase(ch)+" ");
        num--;
   }
   
  System.out.println();
 }
}
}
