public class SortedOrNot
{
 static boolean check(int[] arr,int index)
 {
   if(index == arr.length-1)
   {
     return true;
   }
  return arr[index] <= arr[index+1] && check(arr,index+1);
 }
}
