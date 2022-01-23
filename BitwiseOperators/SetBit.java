public class SetBit
{
public static void main(String[] args)
{
 int n = 86;
 int k=5;
 System.out.println(setBit(n,k));
}
static int setBit(int n,int k)
{
 return n|(1 << (k-2));
}
}
