/*pattern using loop
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
*/
public class Pattern17
{
public static void main(String[] args)
{
  int n = 5;
  pattern17(n);
}
static void pattern17(int n)
{
  int spacelength=0;
  int totalcols=0; 
  int spacelength2=0;
for(int row=1;row <2*n;row++)
 {
   if(row>n)
   {
     totalcols=2*n-row;
     spacelength=row-n;
     spacelength2=row-n;
   }
   else
   {
    spacelength = n-row;
    totalcols = row;
    spacelength2=n-row;
   }

   for(int space=0;space<=spacelength;space++)
    {
       
      System.out.print("*");
    }
   for(int column=2;column<=totalcols;column++)
   {
       if(row == 1 || row == 10)
       {
         System.out.print("*");
       }
       else
       {
         System.out.print("  ");
       }
        
   }
   for(int space=0;space<=spacelength2;space++)
    {
      System.out.print("*");
    }
  System.out.println();
 }
}
}
