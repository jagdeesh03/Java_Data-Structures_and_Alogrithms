public class BinarySearch
{
public static void main(String[] args)
{
  int[] arr = {3,22,55,66,77,88,99};
  int target = 88;
  System.out.println(recursionBS(arr,target,0,arr.length-1));
}
static int recursionBS(int[] arr,int target,int start,int end)
{
   if(start>end)
   {
     return -1;
   }
   int mid = start+(end-start)/2;
   if(arr[mid] == target)
   {
      return mid;
   }
   if(  arr[mid] > target)
   {
     return recursionBS( arr, target, start, mid-1);
   }
  
     return recursionBS( arr, target, mid+1,end);
}
}
