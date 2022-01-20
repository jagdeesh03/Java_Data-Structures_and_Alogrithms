/*print the patterns using loops
  ****
  *** 
  ** 
  *
*/
public class Pattern3
{
 public static void main(String[] args)
 {
   int n=4;
   pattern3(n);
 }
 static void pattern3(int n)
 {
   for(int row=1;row<=n;row++)
   {
     for(int column=1;column<=(n+1)-row;column++)
      {
        System.out.print("* ");
      }
     System.out.println();
   }
 }
}
