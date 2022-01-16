import java.util.*;
public class MissingNumber
{
public static void main(String[] args)
{
  int[] arr = {6,5,4,0,1,2,3,7,9};
  sort(arr);
  int output = missingNumber(arr);
  System.out.println(" Found the answer "+output);
}
static int missingNumber(int[] arr)
{
   for(int index=0;index<arr.length;index++)
   {
      if(arr[index] != index)
       {
         return index;
       }
   }
   return arr.length;
}
static void sort(int[] arr)
{
    int i=0;
    while(i<arr.length)
    {
      int correctIndex = arr[i];
      if(arr[i] < arr.length && arr[i] != arr[correctIndex])
       {
          swap(arr,i,correctIndex);
       } 
      else
       {
         i++;
       }
    }
}
static void swap(int[] arr,int start,int last)
{
   int temp = arr[start];
   arr[start] = arr[last];
   arr[last] = temp;
}
}
