public class Steps
{
// number is anything divide by 2 count it otherwise subtract and count it. 
public static void main(String[] args)
{
  int n = 14;
  int ans = steps(n);
  System.out.println(ans);
}
static int steps(int n)
{
  return helper(n,0);
}
static int helper(int n,int c)
{
  if(n == 0)
  {
    return c;
  }
  if(n%2 == 0)
  {
    return helper(n/2,c+1);
  }
  return helper(n-1,c+1);
}
}
