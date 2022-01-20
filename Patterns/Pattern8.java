/*print the patterns using loops
      *
     * *
    * * *
   * * * *
  * * * * *
*/
public class Pattern8
{
 public static void main(String[] args)
 {
   int n=5;
   pattern8(n);
 }
 static void pattern8(int n)
 {
   for(int row=1;row <= n;row++)
   {
     for(int space=1;space<(n+1)-row;space++)
     {
       System.out.print(" ");
     }
     
     for(int column=1;column<=row;column++)
      { 
        System.out.print("* ");
      }
     System.out.println();
   }
 }
}
