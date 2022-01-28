public class CountZeros
{
public static void main(String[] args)
{
 int ans = count(60606);
 System.out.println(ans);
}
static int count(int n)
{
  return counting(n,0);
}
static int counting(int n,int c)
{
  if(n%10 == n)
  {
    return c;
  }
  if((n%10) == 0)
  {
    c = c+1;
    return counting(n/10,c);
  }
  return counting(n/10,c);
}
}
