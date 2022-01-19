import java.util.Arrays;
public class SelectionSort
{
public static void main(String[] args)
{
  int[] arr = {34,3,45,22,1};
  sort(arr);
  System.out.println(Arrays.toString(arr));
 
}
static void sort(int[] arr)
{
  for(int i=0;i<arr.length-1;i++)
  {
    int max = max(arr,arr.length-1-i);
    swap(arr,max,arr.length-1-i);
  }
}
static int max(int[] arr,int last)
{
  int max=0;
  for(int j=0;j<=last;j++)
    {
        if(arr[j] > arr[max])
        {
          max = j;
        }    
    }
   return max;
}
static void swap(int[] arr,int start,int last)
{
   int temp = arr[start];
   arr[start] = arr[last];
   arr[last] = temp; 
}
}
