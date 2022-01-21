/*Pattern using loop
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
public class Pattern19
{
public static void main(String[] args)
{
  int n = 5;
  pattern19(n);
}
static void pattern19(int n)
{
int i=1;
for(int row=1;row <= n;row++)
 {
    for(int column=1;column<=row;column++)
     {
        if((row+column)%2 == 0)
         {
           System.out.print(1+" ");
         }
        else
         {
           System.out.print(0+" ");
         }
         
       }
     System.out.println();
    }
   }
 }
