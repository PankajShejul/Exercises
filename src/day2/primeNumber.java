package day2;

public class primeNumber {
  public static void primeNumberSeries(int n){
    for(int i=2;i<=n;i++)
    {
      int count=0;
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==0)
      {
        System.out.println(i);
      }

    }
  }

  public static void isPrimeNumber(int n)
  {
    int count=0;
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==0)
    {
      System.out.println(n+" is Prime Number");
    }else{
      System.out.println(n+" is not a Prime Number");
    }
  }
  public static void main(String[] args) {
    //primeNumberSeries(20);
    isPrimeNumber(5);
    isPrimeNumber(6);
  }
}
