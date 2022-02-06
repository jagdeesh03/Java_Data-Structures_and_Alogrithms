import java.util.*;
public class Combinations
{
public static void main(String[] args)
{
  find("","abc");
}
static void find(String p,String unProcess)
{
  if(unProcess.isEmpty())
  { 
    System.out.println(p);
    return;
  }

  char ch = unProcess.charAt(0);
  find(p+ch,unProcess.substring(1));
  find(p,unProcess.substring(1));
}
}
