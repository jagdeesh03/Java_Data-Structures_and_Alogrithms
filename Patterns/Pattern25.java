/* pattern using loop
              1 
            2 1 2 
          3 2 1 2 3 
        4 3 2 1 2 3 4 
      5 4 3 2 1 2 3 4 5 
    6 5 4 3 2 1 2 3 4 5 6
*/ 
import java.util.*;
public class Pattern25
{
public static void main(String[] args)
{
  int n = 7;
  pattern25(n);
}
static void pattern25(int n)
{

for(int row=1; row < n ;row++)
 {
   for(int space=1;space<=(n-row+1);space++)
   {
     System.out.print("  ");
   }
   
   for(int column=row;column>=1;column--)
   {
     System.out.print(column+" ");
   }
   for( int col=2;col<=row;col++)
   {
     System.out.print(col+" ");
   }
  System.out.println();
 }
}
}
