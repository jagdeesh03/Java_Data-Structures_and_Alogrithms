import java.util.*;
public class Bit
{
public static void main(String[] args)
{
  int value = 14; 
  int n=4;   
  System.out.println(ithBit(value,n));
}
static int  ithBit(int value,int n)
{
  return (value >> (n-1))&1;                                                  
}
}
