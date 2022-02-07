/*output:
 cba
bca
bac
cab
acb
abc
count : 6*/
import java.util.*;
public class CountPermutation
{

 static int permutations(String p,String up)
 {
   if(up.isEmpty())
   {
     return 1;
   }
   int count = 0; 
   char ch = up.charAt(0);
   for(int i=0;i<=p.length();i++)
   {
     String first = p.substring(0,i);
     String second = p.substring(i,p.length());
     count = count + permutations(first+ch+second,up.substring(1));
   }
   return count;
 }
}
