import java.util.*;
public class Bubblesort
{
public static void main(String[] args)
{
  int[] arr = {3,1,5,4,2};
  sort(arr);
  System.out.println(Arrays.toString(arr));
}
static void sort(int[] arr)
{
  boolean swapped;
  for(int i=0;i<arr.length;i++)
  {
   swapped = false;
   for(int j=1;j<(arr.length-i);j++)
   {
      if(arr[j-1] > arr[j])
      {
        swap(arr,j-1,j);
        swapped = true;
      }
   }
   if(!swapped)
   {
     break;
   } 
  }
}
static void swap(int[] arr,int start,int end)
{
  int temp = arr[start];
  arr[start]=arr[end];
  arr[end]=temp;
}
}
