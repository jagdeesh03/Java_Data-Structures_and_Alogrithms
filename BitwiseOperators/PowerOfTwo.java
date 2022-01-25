import java.util.*;
public class PowerOfTwo
{
public static void main(String[] args)
{
 Scanner sd = new Scanner(System.in);
 int n = sd.nextInt();
 boolean output; 
 if(n==0)
 {
  output=false;
 }
 else
 {
  output = (n&(n-1))==0;//true or false
 }
 System.out.println(output);
}
}
