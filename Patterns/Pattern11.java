/*print the patterns using loops
   *********
    *******
     *****
      ***
       *
*/
public class Pattern11
{
 public static void main(String[] args)
 {
   int n=5;
   pattern11(n);
 }
 static void pattern11(int n)
 {
   int i=0;
   for(int row=1;row <= n;row++)
   {
     for(int space=1;space<row;space++)
     {
       System.out.print(" ");
     }
     for(int column=1;column<=(2*n-row-i);column++)
      { 
        System.out.print("*");
      }
     i++;
     System.out.println();
   }
 }
}
