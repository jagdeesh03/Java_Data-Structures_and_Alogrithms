/*print the patterns using loops
      *
    *  *
   *    * 
  *      *
 ********** 
*/
public class Pattern13
{
 public static void main(String[] args)
 {
   int n=5;
   pattern13(n);
 }
 static void pattern13(int n)
 {
    int i=0;
    for(int row=1;row <= n;row++)
     {
       for(int space=1;space<=n-row;space++)
       {
         System.out.print(" ");
       }
       for(int column=1;column<=(row+i);column++)
       {
         if(column == 1 || column == (row+i) || row == n)
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
