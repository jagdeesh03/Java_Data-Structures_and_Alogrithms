public class SumofNumber
{
public static void main(String[] args)
{
  int ans = sum(15);
  System.out.println(ans);
} 
static int sum(int n)
{
  if(n==1)
  {
   return 1;
  }
  return n+sum(n-1);
}
}
