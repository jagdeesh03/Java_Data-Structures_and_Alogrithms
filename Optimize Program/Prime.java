public class Prime
{
public static void main(String[] args)
{
  int n=5;
  System.out.println(isPrime(n));
}
static boolean isPrime(int n)
{
 int c=2;
 if(n==0)
 {
  return false;
 }
 while(c*c <= n)
 {
   if(n%c == 0)
   {
     return false;
   }
   c++;
 }
 return true;
}
}
