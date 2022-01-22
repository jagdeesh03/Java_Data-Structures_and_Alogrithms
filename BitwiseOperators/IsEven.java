import java.util.*;
public class IsEven
{
public static void main(String[] args)
{
  int n = 22888;
 if(isOdd(n) == true)
  {
   System.out.println("ODD");
  }
  else
  {
   System.out.println("Even");
  }
}
static boolean isOdd(int n)
{
  
  return (n&1)==1; 
}
}
