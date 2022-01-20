/*print the patterns using loops
      *
     **
    ***
   ****
  *****
*/
public class Pattern6
{
 public static void main(String[] args)
 {
   int n=5;
   pattern6(n);
 }
 static void pattern6(int n)
 {
   for(int row=1;row <= n;row++)
   {
     for(int space=0;space<n-row;space++)
     {
       System.out.print(" ");
     }
     
     for(int column=1;column<=row;column++)
      {
        System.out.print("*");
      }
     System.out.println();
   }
 }
}
