package recursion;

public class RecursionFibonacci {

  // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 84, 144 ...
  // the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 -> 2+3

  public static int fibonacciIterative(int n) {
    int previous = 0;
    int current = 1;
    
    if (n == 0) {
      current = 0;
    }

    for (int i = 2; i <= n; i++) {
      int next = current;
      current = previous + current;
      previous = next;
    }

    System.out.println(current);
    return current;
  }

  public static int fibonacciRecursive(int n) {
    if (n < 2) {
      return n;
    }

    int result = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    System.out.println(result);
    return result;
  }
}