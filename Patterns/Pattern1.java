/*print the patterns using loops
  *****
  ***** 
  ***** 
  *****
*/
public class Pattern1
{
 public static void main(String[] args)
 {
   int n=4;
   pattern1(n);
 }
 static void pattern1(int n)
 {
   for(int row=1;row<=n;row++)
   {
     for(int column=1;column<=n;column++)
      {
        System.out.print("* ");
      }
     System.out.println();
   }
 }
}
