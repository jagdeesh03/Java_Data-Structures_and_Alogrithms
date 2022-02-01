import java.util.*;
public class PassingArgs
{
static ArrayList<Integer> search(int[] arr,int index,int target,ArrayList<Integer> list)
{
  if(index == arr.length)
  {
    return list;
  }
  if(arr[index] == target)
  {
    list.add(index);
  }
  return search(arr,index+1,target,list);
}
}
