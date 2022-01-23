public class FloorArray
{
public static void main(String[] args)
{
  int[] arr={10,11,22,33,44,55,66,77};
  int target = 70;
  int ans = floorarray(arr,target);
  System.out.println(arr[ans]);
}
static int floorarray(int[] arr,int target)
{
 int start = 0;
 int end = arr.length-1;
 while(start <= end)
 {
  int mid = (start+end)/2;
  if(arr[mid] == target)
  {
    return mid;
  }
  else if(target > arr[mid])
  {
     start=start+1;
  }
  else
  {
     end = end-1;
  }
 }
 return end;
}
}
