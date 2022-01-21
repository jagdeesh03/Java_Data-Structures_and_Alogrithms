/* pattern using loop
4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4 
4 3 2 2 2 2 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 1 0 1 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4 
4 4 4 4 4 4 4 4 4 


*/ 
import java.util.*;
public class Pattern24
{
public static void main(String[] args)
{
  int n = 4;
  pattern24(n);
}
static void pattern24(int n)
{
 int originalN=n;
 n=2*n;
for(int row=0; row <=n ;row++)
 {
   
   for(int column=0;column<=n;column++)
   {
     int atEveryIndex =originalN-Math.min(Math.min(row,column),Math.min(n-row,n-column));
     System.out.print(atEveryIndex+" ");
   }
   
  System.out.println();
 }
}
}
