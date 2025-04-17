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