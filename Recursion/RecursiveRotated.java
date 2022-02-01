public class RecursiveRotated
{
static int rotated(int[] arr,int target,int start,int end)
{
 if(start > end)
 {
  return -1;
 }
 int mid = start-(end+start)/2;
 if(arr[mid] == target) 
 {
   return mid;
 }
 
 if(arr[start] <= arr[mid])
 {
   if(target >= arr[start] && target <= arr[mid])
   {
     return rotated(arr,target,start,mid-1); 
   }
   else
   { 
    return rotated(arr,target,mid+1,end);
   }
 }
 if(target >= arr[mid] && target <= arr[end])
 {
   return rotated(arr,target,mid+1,end);
 }
 
 return rotated(arr,target,start,mid-1);
}
}
