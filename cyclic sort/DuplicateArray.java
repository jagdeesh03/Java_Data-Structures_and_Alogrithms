import java.util.*;
public class DuplicateArray
{
public static void main(String[] args)
{
  int[] arr = {1,3,4,2,2};
  int output = sortAndFind(arr);;
  System.out.println(output);
}
static int sortAndFind(int[] arr)
{
  int i=0; 
  int outcome=0; 
  while(i<arr.length)
  {
   if(arr[i] != i+1)
   {
       int index=arr[i]-1;
       if(arr[i] != arr[index])
      {
       swap(arr,i,index);
      }
      else
      {
        return arr[i];
      }  
   }
   else
   {
     i++;
   }
 }
 return -1;
}
static void swap(int[] arr, int start,int last)
{
  int temp = arr[start];
  arr[start] = arr[last];
  arr[last] = temp;
}

}
