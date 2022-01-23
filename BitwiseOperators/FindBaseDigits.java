//find the no. of the digits in base
import java.util.*;
public class FindBaseDigits
{
 public static void main(String[] args)
 {
   int n=6;
   int base=2;
   int ans=0;
   ans = (int)(Math.log(n)/Math.log(base))+1; 
   System.out.println(ans);
 }
}

