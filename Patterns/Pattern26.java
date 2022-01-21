/*
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 

*/
import java.util.*;
public class Pattern26
{
public static void main(String[] args)
{
  int n = 4;
  pattern26(n);
}
static void pattern26(int n)
{
int spacelength=0;
for(int row=1; row < 2*n ;row++)
 {
   if(row<n)
   {
     spacelength = (n-row+1);
     for(int space=1;space<=spacelength;space++)
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
    else
   {
     int spacelength2=row-n;
     for(int space=0;space<=spacelength2;space++)
       {
         System.out.print("  ");
       }  
       for(int column=2*n-row;column>=1;column--)
       {
         System.out.print(column+" ");
       }
      for( int col=2;col<=2*n-row;col++)
      {
        System.out.print(col+" ");
      }
      System.out.println();
   }
    
       
   }
  
 }
}
