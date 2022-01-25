public class RangePrime
{
public static void main(String[] args)
{
 int n=40;
 boolean[] primes = new boolean[n+1];
 range(n,primes);
}
static void range(int n,boolean[] primes)
{
  for(int i=2;i*i<=n;i++)
  {
    if(!primes[i])
    {
       for(int j=i*2;j<=n;j=j+i)
        {
          primes[j] = true;
        }
    }
  }
  for(int k=2;k<=n;k++)
  {
    if(!primes[k])
    {
      System.out.print(k+" ");
    }
  }
}
}
