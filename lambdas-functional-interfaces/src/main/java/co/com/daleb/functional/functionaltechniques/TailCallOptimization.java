package co.com.daleb.functional.functionaltechniques;

public class TailCallOptimization {

  public static void main(String[] args) {}

  // Normal Recursion way
  public static long reFact(int n) {
    if (n <= 1) return 1; else return n * reFact(n - 1);
  }

  public static long tailReFact(int n, int a) {
    if (n <= 1) return a; else return tailReFact(n - 1, n * a);
  }
}
