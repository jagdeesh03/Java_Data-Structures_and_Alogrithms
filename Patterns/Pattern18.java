/*pattern using loop
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
public class Pattern18
{
public static void main(String[] args)
{
  int n = 5;
  pattern18(n);
}
static void pattern18(int n)
{
int i=1;
for(int row=1;row <= n;row++)
 {
   for(int column=1;column<=row;column++)
   {
        System.out.print(i+" ");
        i++;
   }
   
  System.out.println();
 }
}
}
