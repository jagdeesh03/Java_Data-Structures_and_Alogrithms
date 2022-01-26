public class Sqrt
{
public static void main(String[] args)
{
  int n=40;
  int p=3;
  System.out.printf("%.3f",sqrt(n,p));
}
static double sqrt(int n,int p)
{
 int start = 0;
 int end = n;
 double root=0.0;
 while(start <= end)
 {
   int mid = start+(end-start)/2;
   if(mid*mid == n)
   {
     return mid;
   }
   else if(mid*mid>n)
   {
    end = mid-1;
   }
   else
   {
     start = mid+1;
   }
 }
 root=end;
 double increment = 0.1;
 for(int i=0;i<p;i++)
 {
   while(root*root <= n)
   {
     root = root+increment;
   }
   root-=increment;
   increment/=10;
 }
 return root;
}
}
