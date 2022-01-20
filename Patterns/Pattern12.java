/*print the patterns using loops
   * * * * 
    * * *
     * *
      *
      *
     * *
    * * *
   * * * * 
*/
public class Pattern12
{
 public static void main(String[] args)
 {
   int n=5;
   pattern12(n);
 }
 static void pattern12(int n)
 {
    int totalcols = 0;
    int spacelength = 0;
    for(int row=1;row<= 2*n;row++)
     {
       if(row>n)
       {
         totalcols = row - n;
         spacelength = (2*n-row)+1;
       }
       else
       {
         totalcols = n-row+1;
         spacelength = row;
       }
      for(int space = 1;space < spacelength;space++)
       {
         System.out.print(" ");
       }
       for(int column=1;column<=totalcols;column++)
       {
         System.out.print("* ");
       }
       System.out.println();
     }  
 }
}
