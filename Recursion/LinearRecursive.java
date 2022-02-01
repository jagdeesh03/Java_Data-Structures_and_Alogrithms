import java.util.*;
public class LinearRecursive
{
public static void main(String[] args)
{
  int[] arr = {2,4,13,13,22};
  int target = 13;
  System.out.println(reverseSearch(arr,arr.length-1,target));
}
static ArrayList list = new ArrayList<>();
static ArrayList<Integer> reverseSearch(int[] arr,int index,int target)
{
  if(index == -1)
  {
    return list;
  }
  if(arr[index] == target)
  {
    list.add(index);
  }
  return reverseSearch(arr,index-1,target);
}
}
