import java.util.*;
public class Key
{
// public static void main(String[] args)
// {
//  int key = 4;
//  int element = 9;
//  int[] arr = {1,2,3,4,5,6,7,8,9};
//  inPlace(arr,key,element);
//  System.out.println(Arrays.toString(arr));
//}
static void inPlace(int[] arr,int key, int element)
{
 int start = arr[0];
  int end = arr.length-1;
  while(start<=end)
  {
  int mid = (start+end)/2;
  if(mid == key)
  {
    for(int i = key;i<arr.length;i++)
    {
     int temp = arr[i];
     arr[i] = arr[arr.length-1];
     arr[arr.length-1] = temp;
    }  
    break;   
  }
  else if (key > mid)
  {
    start = mid + 1;
  }
  
  else 
  {
    end = mid -1;
  }
  }
 
}
}
