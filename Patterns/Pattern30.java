public class Matrix
{
public static void main(String[] args)
 {
  for(int i = 1 ; i<=5;i++)
  {
    int k = i;
    for(int j=1;j<=5;j++)
    { 
         System.out.print(i+" ");
         i = i + 5;
    }
   System.out.println();
   i=k;
  }
 }
}
