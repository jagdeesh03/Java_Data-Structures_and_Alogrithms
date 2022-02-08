import java.util.*;
public class Repeat
{
public static void run()
{
// int[] a1 = {1,2,2,3,4,6};
// int[] a2 = {1,2,3,4};
// ArrayList<Integer> list = new ArrayList<>();
 boolean[] prime = new boolean[15];
 int i=0;
 int j=0;
 while(i < a1.length && j < a2.length)
 {
     if(!prime[a1[i]])
     {
       if(a1[i] == a2[j])
       {
         prime[a1[i]] = true;
       }
         i++;
         j++;
     }
     else
     {
       i++;
     }
 }
 while(i < a1.length)
  {
    list.add(a1[i]);
    i++; 
  }
  while(j < a2.length)
  {
    list.add(a2[j]);
    j++; 
  }
 System.out.println(list);
}
}
