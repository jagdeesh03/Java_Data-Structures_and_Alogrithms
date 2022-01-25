import java.util.*;
public class FlipImage
{
public static void main(String[] args)
{
 int[][] image ={
      {0,1,1},
      {1,0,1},
      {0,0,1},
    };
 flip(image);
 for(int[] print:image)
 {
   System.out.println(Arrays.toString(print));
 }
}
static void flip(int[][] image)
{
  for(int[] row:image)
  {
    for(int i=0;i<(image[0].length+1)/2;i++)
     {
        int temp = row[i];
        row[i] = row[image[0].length-1-i];
        row[image[0].length-1-i]=temp;
     }
  }
}
}
