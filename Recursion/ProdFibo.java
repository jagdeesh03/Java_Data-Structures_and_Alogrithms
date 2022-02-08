import java.util.*;
public class ProdFibo
{
//public static void main(String[] args)
//{
// System.out.println(prod(714));
//  System.out.println(prod(800));
//}
static ArrayList<Object> prod(int p)
{
  ArrayList<Object> list = new ArrayList<>();
  int a = 0;
  int b = 1;
  int t1 = 0;
  int t2 =0;
  while(a*b <= p)
  {
      t1=a;
      t2=b;   
     int t = a+b;
     a = b;
     b = t;
  }
  
  if(t1*t2 == p)
   {
    list.add(t1);
    list.add(t2);
    list.add(true);
   }
   else
   {
     list.add(a);
     list.add(b);
     list.add(false);
   }
  return list;
}
}
