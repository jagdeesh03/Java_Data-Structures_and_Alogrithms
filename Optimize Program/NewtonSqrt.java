public class NewtonSqrt
{
public static void main(String[] args)
{
  int n=40;
  newtonsqrt(n);
}
static void newtonsqrt(int n)
{
  double x = n;
  double root;
  while(true)
  {
    root = 0.5*(x+(n/x));
    if(Math.abs(root-x)<1)
    {
      break;
    }
   x=root;
  }
 System.out.println(root);
}
}

