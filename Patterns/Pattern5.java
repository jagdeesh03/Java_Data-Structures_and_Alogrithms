/*print the patterns using loops
  *
  **
  ***
  ****
  *****
  ****
  ***
  **
  * 
*/
public class Pattern5
{
 public static void main(String[] args)
 {
   int n=5;
   pattern5(n);
 }
 static void pattern5(int n)
 {
   for(int row=1;row <= 2 * n;row++)
   {
     int totalcolumn = (row>n)?(2*n-row):row;
     for(int column=1;column<=totalcolumn;column++)
      {
        System.out.print("*");
      }
     System.out.println();
   }
 }
}
