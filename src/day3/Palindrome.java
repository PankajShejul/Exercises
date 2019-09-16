package day3;

public class Palindrome {
  public static boolean isPalindrome(String input){
    int i=0,j=input.length()-1;
    boolean result=true;
    while(i<j)
    {
      if(input.charAt(i)!=input.charAt(j))
      {
        result=false;
        break;
      }
      i++;
      j--;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("is AAA Palindrome: "+isPalindrome("AAA"));
    System.out.println("is aba Palindrome: "+ isPalindrome("aba"));
    System.out.println("is abba Palindrome: "+ isPalindrome("abba"));
    System.out.println("is aabb Palindrome: "+ isPalindrome("aabb"));
  }
}
