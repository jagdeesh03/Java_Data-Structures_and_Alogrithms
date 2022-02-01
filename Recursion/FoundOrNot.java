public class FoundOrNot
{

static boolean search(int[] arr,int index,int target)
{
  if(index == arr.length)
  {
    return false;
  }
  if(arr[index] == target)
  {
    return true;
  }
  return search(arr,index+1,target);
}
}
