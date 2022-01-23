public class ResetBit
{
public static void main(String[] args)
{
 int n = 86;
 int k =5;
 System.out.println(resetBit(n,k));
}
static int resetBit(int n,int k)
{ 
 return n&(~(1<<(k-1)));

}
}
