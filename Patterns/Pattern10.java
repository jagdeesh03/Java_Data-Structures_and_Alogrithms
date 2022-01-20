/*print the patterns using loops
     *
    ***
   *****
  *******
*/
public class Pattern10
{
 public static void main(String[] args)
 {
   int n=4;
   pattern10(n);
 }
 static void pattern10(int n)
 {
   int i=0;
   for(int row=1;row <= n;row++)
   {
     for(int space=1;space<=(n-row);space++)
     {
       System.out.print(" ");
     }
     for(int column=1;column<=(row+i);column++)
      { 
        System.out.print("*");
      }
     i++;
     System.out.println();
   }
 }
}
