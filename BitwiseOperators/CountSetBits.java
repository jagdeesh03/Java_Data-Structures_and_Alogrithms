public class CountSetBits
{
public static void main(String[] args)
{
  int value = 6;
  int count = 0;
  while(value > 0)
  {
    if((value&1)==1)
    {
      count++;
    }
    value=value>>1;
  }
  System.out.println(count);//2 
}
}
