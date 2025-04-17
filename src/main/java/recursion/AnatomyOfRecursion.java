package recursion;

public class AnatomyOfRecursion {
  static int counter = 0;

  public static String test() {
    if (counter > 3) {
      return "done";
    }

    counter++;
    String result = test();
    System.out.println(result);
    return result;
  }
}

// 1. Identify the base case
// 2. Identify the recursive case
// 3. Get closer and closer and return when needed. Usually you have 2 returns