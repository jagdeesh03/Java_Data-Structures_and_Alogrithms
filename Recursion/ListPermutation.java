/*
output:
[cba, bca, bac, cab, acb, abc]*/

import java.util.*;
public class ListPermutation
{
 static ArrayList<String> permutations(String p,String up)
 {
   ArrayList<String> list = new ArrayList<>();
   if(up.isEmpty())
   {
     list.add(p);
     return list;
   }
   int count = 0; 
   char ch = up.charAt(0);
   for(int i=0;i<=p.length();i++)
   {
     String first = p.substring(0,i);
     String second = p.substring(i,p.length());
     list.addAll(permutations(first+ch+second,up.substring(1)));
   }
   return list;
 }
}
