/*print the patterns using loops
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

*/  
public class Pattern15
{
 public static void main(String[] args)
 {
   int n=5;
   pattern15(n);
 }
 static void pattern15(int n)
 {
    int totalcolumn=0;
    int spacelength=0;
    for(int row=1;row < 2*n;row++)
     {
       if(row > n)
       {
         spacelength = row-n;
         totalcolumn = (2*n-row);
       }
       else
       {
         spacelength = n-row;
         totalcolumn = row;
       }
       for(int space=1;space<=spacelength;space++)
       {
         System.out.print(" ");
       }
       for(int column=1;column<=totalcolumn;column++)
       {
         if(column == 1 || column == totalcolumn)
         {
           System.out.print("*"+ " ");
         }
         else
         {
            System.out.print("  ");   
         } 
          
       }   
       System.out.println();
     }  
 }
}
