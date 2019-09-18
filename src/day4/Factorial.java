package day4;

import org.jetbrains.annotations.Contract;

public class Factorial {

  public static int factorial(int number)
  {
    int result =1;
    while(number!=0)
    {
      result=result*number;
      number--;
    }
    return result;
  }


  public static int recFactorial(int number){
    if(number==0)
      return 1;
    return number*recFactorial(number-1);

  }
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(recFactorial(5));
  }
}
