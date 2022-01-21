/* pattern using loop
a 
b c 
d e f 
g h i j 
k l m n o
*/ 
public class Pattern21
{
public static void main(String[] args)
{
  int n = 6;
  pattern21(n);
}
static void pattern21(int n)
{
int i=0;
for(int row=0;row < n;row++)
 {
   for(int column=0;column<row;column++)
   {
        char ch=(char)('a'+i);
        System.out.print(ch+" ");
        i++;
   }
   
  System.out.println();
 }
}
}
