import java.util.*;
public class SetMismatch
{
public static void main(String[] args)
{
  int[] arr = {1,2,2,4};
  sort(arr);
  int[] output = setMismatch(arr);
  System.out.println(Arrays.toString(output));
}
static void sort(int[] arr)
{
  int i=0;
  while(i<arr.length)
  {
    int index = arr[i]-1;
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
static void swap(int[] arr,int start,int last)
{
  int temp = arr[start];
  arr[start] = arr[last];
  arr[last] = temp;
}
static int[] setMismatch(int[] arr)
{
  for(int index=0;index<arr.length;index++)
  {
    if(arr[index] != index+1)
    {
      return new int[]{arr[index],index+1};
    }
  }
  return new int[]{-1,-1};
}
}
