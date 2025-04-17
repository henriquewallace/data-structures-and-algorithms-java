package recursion;

public class RecursionFactorial {

  // Write two funcions that finds the factorial of any number. One should use recursive, the other should just use a for loop.

  public static int findFactorialRecursive(int number) { // O(n)
    // 5! = 5 * 4 * 3 * 2 * 1
    if (number == 2) {
      return 2;
    }

    int result = number * findFactorialRecursive(number - 1);
    System.out.println(result);
    return result;
  }

  public static int findFactorialIterative(int number) {
    int factorial = number;
    
    for (int i = number - 1; i != 0; i--) {
      factorial = factorial * i;
      System.out.println(factorial);
    }

    return factorial;
  }

  // or

  public static int findFactorialIterativeV2(int number) { // O(n)
    int answer = 1;
    if (number == 2) {
      answer = 2;
    }

    for (int i = 2; i <= number; i++) {
      answer = answer * i;
      System.out.println(answer);
    }

    return answer;
  }

}