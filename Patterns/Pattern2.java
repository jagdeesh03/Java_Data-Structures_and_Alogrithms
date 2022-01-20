/*print the patterns using loops
  *
  ** 
  *** 
  ****
*/
public class Pattern2
{
 public static void main(String[] args)
 {
   int n=4;
   pattern2(n);
 }
 static void pattern2(int n)
 {
   for(int row=1;row<=n;row++)
   {
     for(int column=1;column<=row;column++)
      {
        System.out.print("* ");
      }
     System.out.println();
   }
 }
}
