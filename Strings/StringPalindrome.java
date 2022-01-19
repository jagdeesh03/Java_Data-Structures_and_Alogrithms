public class StringPalindrome
{
 public static void main(String[] args)
 {
   String name ="abcdcba";
   boolean output = isPalindrome(name);
   if(output == true)
   {
     System.out.println("Palindrome");
   }
   else
   {
     System.out.println("Not a Palindrome");
   } 
 }
 static boolean isPalindrome(String str)
 {
   str = str.toLowerCase();
   for(int i=0;i<str.length()/2;i++)
   {
      char start = str.charAt(i);
      char end = str.charAt(str.length()-1-i);
      if(start != end)
      {
         return false;
      }   
   }
   return true;
 }
}
