package day1;

public class Fibonacci {
  public static void fibonacci(int n){
    int m=0,p=1,result=0;
    for(int i=0;i<n;i++)
    {
      System.out.println(result);
      result=m+p;

      m=p;
      p=result;
    }
  }
  public static int recFibonacci(int n){
    if(n<=1)
    {
      return n;
    }
    return recFibonacci(n-1)+recFibonacci(n-2);
  }

  public static void main(String[] args) {
      fibonacci(10);
    //System.out.println(recFibonacci(9));
  }
}
