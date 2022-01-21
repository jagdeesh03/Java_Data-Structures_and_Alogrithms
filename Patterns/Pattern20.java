/* pattern using loop
1 1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 
4 4 4 
5 5 
6*/ 
public class Pattern20
{
public static void main(String[] args)
{
  int n = 6;
  pattern20(n);
}
static void pattern20(int n)
{
int i=1;
for(int row=1;row <= n;row++)
 {
   for(int column=1;column<=(n-row+1);column++)
   {
        System.out.print(i+" ");
   }
   i++;
   
  System.out.println();
 }
}
}
