/*print the patterns using loops
 **********
  *      *
   *    *
    *  *
      * 
*/
public class Pattern14
{
 public static void main(String[] args)
 {
   int n=5;
   pattern14(n);
 }
 static void pattern14(int n)
 {
    int i=0;
    for(int row=1;row <= n;row++)
     {
       for(int space=1;space<=row;space++)
       {
         System.out.print(" ");
       }
       for(int column=1;column<=(2*n-row-i);column++)
       {
         if(column == 1 || column == (2*n-row-i) || row == 1)
         {
           System.out.print("*");
         }
         else
         {
            System.out.print(" ");   
         } 
        
       }        
       i++;
       System.out.println();
     }  
 }
}
