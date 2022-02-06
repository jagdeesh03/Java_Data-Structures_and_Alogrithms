import java.util.*;
public class FindandRemove
{
public static void main(String[] args)
{
  System.out.println(find("","abcazazcabafa")); 
}
static String find(String p,String unProcess)
{
  if(unProcess.isEmpty())
  { 
    return p;
  }
  char ch = unProcess.charAt(0);
  if(ch == 'a')
  {
   return find(p,unProcess.substring(1));
  }
   return find(p+ch,unProcess.substring(1));
 
}
}
