/*print the patterns using loops
      * * * *
       * * *
        * *
         *
*/
public class Pattern9
{
 public static void main(String[] args)
 {
   int n=4;
   pattern9(n);
 }
 static void pattern9(int n)
 {
   for(int row=1;row <= n;row++)
   {
     for(int space=1;space<row;space++)
     {
       System.out.print(" ");
     }
     
     for(int column=1;column<=(n+1)-row;column++)
      { 
        System.out.print("* ");
      }
     System.out.println();
   }
 }
}
