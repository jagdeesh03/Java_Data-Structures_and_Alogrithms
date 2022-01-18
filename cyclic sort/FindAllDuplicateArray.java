import java.util.*;
public class FindAllDuplicateArray
{
public static void main(String[] args)
{
  int[] arr = {4,3,2,7,8,2,3,1};
  sort(arr);
  List output = AllDuplicates(arr);
  System.out.println(output);
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
static void swap(int[] arr,int frst,int last)
{
  int temp = arr[frst];
  arr[frst] = arr[last];
  arr[last] = temp;
}
static List<Integer> AllDuplicates(int[] arr)
{
  ArrayList<Integer> list = new ArrayList<>();
  for(int index=0;index<arr.length;index++)
   {
      if(arr[index] != index+1)
      {
        list.add(arr[index]);     
      }
   }
  return list;
}
}
