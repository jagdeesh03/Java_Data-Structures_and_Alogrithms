import java.util.*;
public class ApplNotApple
{
public static void main(String[] args)
{
  System.out.println(find("","abcapplebafa"));
  System.out.println(find("","abcappbafa")); 
}
static String find(String p,String unProcess)
{
  if(unProcess.isEmpty())
  { 
    return p;
  }

  char ch = unProcess.charAt(0);
  if(unProcess.startsWith("app") && !unProcess.startsWith("apple") )
  {
   return find(p,unProcess.substring(5));
  }
   return find(p+ch,unProcess.substring(1));
 
}
}
