/*print the patterns using loops
  1
  1 2 
  1 2 3
  1 2 3 4 
*/
public class Pattern4
{
 public static void main(String[] args)
 {
   int n=4;
   pattern4(n);
 }
 static void pattern4(int n)
 {
   for(int row=1;row<=n;row++)
   {
     for(int column=1;column<=row;column++)
      {
        System.out.print(column+" ");
      }
     System.out.println();
   }
 }
}
