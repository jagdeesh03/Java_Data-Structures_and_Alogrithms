import java.util.*;
public class CyclicSort
{
  public static void main(String[] args)
   {
      int[] arr = {3,5,4,2,1};
      cyclic(arr);
      System.out.println(Arrays.toString(arr));
   }
  static void cyclic(int[] arr)
   {
        int i=0;
        while(i<arr.length)
        {
          int correctIndex = arr[i]-1;
           if(arr[i] != arr[correctIndex])
    
       {
             swap(arr,i,correctIndex);
           }
           else
           {
             i++;
           } 
        }
   }
  static void swap(int[] arr,int start,int correctIndex)
  {
      int temp = arr[start];
      arr[start] = arr[correctIndex];
      arr[correctIndex]=temp;
  }
}
