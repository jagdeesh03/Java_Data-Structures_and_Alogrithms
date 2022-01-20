/*print the patterns using loops
      *
     **
    ***
   ****
  *****
*/
public class Pattern7
{
 public static void main(String[] args)
 {
   int n=5;
   pattern7(n);
 }
 static void pattern7(int n)
 {
   for(int row=1;row <= n;row++)
   {
     for(int space=1;space<row;space++)
     {
       System.out.print(" ");
     }
     
     for(int column=1;column<=(n+1)-row;column++)
      { 
        System.out.print("*");
      }
     System.out.println();
   }
 }
}
