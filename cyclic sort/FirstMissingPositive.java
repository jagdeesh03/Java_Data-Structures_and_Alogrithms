import java.util.*;
public class FirstMissingPositive
{
  public static void main(String[] args)
  { 
    int[] arr = {1,2,0};
    sort(arr);
    int output = firstMissingPositive(arr);
    System.out.println(output);
  }
  static void sort(int[] arr)
  {
   int i=0;
   while(i<arr.length)
   {
     int index = arr[i]-1;
     if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[index])
     {
       swap(arr,i,index);
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
static int firstMissingPositive(int[] arr)
{
  for(int index=0;index<arr.length;index++)
  {
    if(arr[index] != index+1)
     {
          return index+1;
     }
  }
  return arr.length+1;  
} 
}
