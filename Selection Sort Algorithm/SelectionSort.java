import java.util.*;
public class SelectionSort
{
public static void main(String[] args)
{
  int[] arr = {44,-1,0,-99,222,11,11,111,11,11};
  selection(arr);
  System.out.println(Arrays.toString(arr));
}

static void selection(int[] arr)
{
    for(int i=0;i<=arr.length-2;i++)
    {
      int max=i+1;
      sort(arr,max);
    }
} 
static void sort(int[] arr,int max)
{
    for(int j=max;j>0;j--)
        {
            if(arr[j]<arr[j-1])
             {
               swap(arr,j,j-1);
             }
            else
             {
               break;
             }
        }
}
static void swap(int[] arr,int start,int last)
    {
        int temp = arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}                      

