public class RecursionPattern
{
public static void main(String[] args)
{
  triangle(4,0);
  triangle2(4,0);
}
static void triangle(int row , int col)
{
  if(row == 0)
  {
   return;
  }
  if(col < row)
  {
    
    System.out.print("*");
    triangle(row,col+1);
  }
  else
  {
    System.out.println();
    triangle(row-1,0);
  }
}
static void triangle2(int r , int c)
{
  if(r == 0)
  {
   return;
  }
  if(c < r)
  {
    triangle2(r,c+1);
    System.out.print("*");
  }
  else
  {
    
    triangle2(r-1,0);
    System.out.println();
  }
} 
}
