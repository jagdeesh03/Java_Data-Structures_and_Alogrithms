 
import java.util.*;
public class Pattern29
{
public static void main(String[] args)
{
  int n = 4;
  pattern29(n);
}
static void pattern29(int n)
{

for(int row=1; row <=2*n ;row++)
 {
 
      if(row <= n)
      {
        for(int k=1;k<=row;k++)
        {
          System.out.print(k+" ");  

        }
       System.out.println();
      }
     else
      {
         for(int k=1;k<=row-n;k++)
        {
          System.out.print(k+" ");  

        }
       System.out.println();
      }
   
   
 }
}
}
