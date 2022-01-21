/* pattern using loop

****
*  *
*  *
****

*/ 
import java.util.*;
public class Pattern27
{
public static void main(String[] args)
{
  int n = 4;
  pattern27(n);
}
static void pattern27(int n)
{

for(int row=1; row <=n ;row++)
 {
   
   for(int column=1;column<=n;column++)
   {
     if(row == 1 || row == n)
     {
          System.out.print("*");
     }
     
     else if(column == 2 || column == 3 )
     {
       System.out.print(" ");
     }
     else
     {
        System.out.print("*");
   
     }
   }
   
  System.out.println();
 }
}
}
