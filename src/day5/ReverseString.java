package day5;

public class ReverseString {
  public static String reverseStringUsingStringBuffer(String str)
  {
    return new StringBuffer(str).reverse().toString();
  }

  public static String reverseStringUsingStringBuilder(String str)
  {
    return new StringBuilder(str).reverse().toString();
  }
  public static String reverseStringUsingAppend(String str)
  {
    if(str==null)
      return str;
    String str1="";
    for(int i=str.length()-1;i>=0;i--)
    {
      str1=str1+str.charAt(i);
    }

    return str1;
  }
  public static void main(String[] args) {
    System.out.println(reverseStringUsingAppend("helloworld"));
    System.out.println(reverseStringUsingStringBuffer("helloworld"));
    System.out.println(reverseStringUsingStringBuilder("helloWorld"));
  }
}
