import java.util.*;
public class AllDisappearingArray
{
public static void main(String[] args)
{
  int[] arr = {4,3,2,7,8,2,3,1};
  sort(arr);
  List output = findDisappearingElements(arr);
  System.out.println(output);
}
static void sort(int[] arr)
{
  int i=0; 
  while(i<arr.length)
  {
   int index=arr[i]-1;
   if(arr[i] != arr[index])
   {
      swap(arr,i,index);
   }
   else
   {
     i++;
   }
 }
}
static void swap(int[] arr, int start,int last)
{
  int temp = arr[start];
  arr[start] = arr[last];
  arr[last] = temp;
}
static List<Integer> findDisappearingElements(int[] arr)
{
   ArrayList<Integer> list = new ArrayList<Integer>();
   for(int index = 0;index<arr.length;index++)
   {
      if(arr[index] != index+1)
       {
           list.add(index+1);
       }
   }

   return list;
}

}
