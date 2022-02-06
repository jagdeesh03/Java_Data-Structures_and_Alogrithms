import java.util.*;
public class ListCombination
{
public static void main(String[] args)
{
  ArrayList<String> ans = yep("","abc");
  System.out.println(ans);
}
static ArrayList<String> yep(String p,String unProcess)
{
  ArrayList<String> list = new ArrayList<>();
  if(unProcess.isEmpty())
  { 
    list.add(p);
    return list;
  }

  char ch = unProcess.charAt(0);
  
  ArrayList<String> left =  yep(p+ch,unProcess.substring(1));
  
  ArrayList<String> right = yep(p,unProcess.substring(1));
  left.addAll(right);
  
  return left;
}
}
