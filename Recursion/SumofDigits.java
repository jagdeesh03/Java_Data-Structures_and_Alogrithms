public class SumofDigits
{
static int sum = 0;
static int digits(int n)
{
  
  if(n%10 == n)
  {
    return n;
  }
  
  return digits(n/10)+(n%10);
}
public static void main(String[] args)
{
  int sum = digits(159999);
  System.out.println(sum);
}
}
