//find the nth row of sum
public class PascalSum
{
public static void main(String[] args)
{
 int n=6;
 pascal(n);
 
}
static void pascal(int n)
{
 int coeff =1;
 int ans =0;
 for(int row=0;row<n;row++)
 {
  for(int col=0;col<=row;col++)
  {
    if(col == 0 || row == 0)
    {
      coeff=1;
    }
    else
    {
      coeff=coeff*(row-col+1)/col;
    }
    if(row == (n-1))
    {
      ans = ans+coeff;     
    }
    System.out.print(coeff+" ");
  }
 System.out.println();
 }
 System.out.println(ans);
}
}
