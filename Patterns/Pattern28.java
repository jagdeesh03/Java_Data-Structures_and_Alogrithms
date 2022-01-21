/* pattern using loop

    ****
   *  *
  *  *
 ****

*/ 
import java.util.*;
public class Pattern28
{
public static void main(String[] args)
{
  int n = 4;
  pattern28(n);
}
static void pattern28(int n)
{

for(int row=1; row <=n ;row++)
 {
   for(int space=1;space<=n-row;space++)
    {
      System.out.print(" ");
    }
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
