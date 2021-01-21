/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {


  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
  int sum = 0;
    for (;lowerBound <= upperBound; lowerBound++){
      sum = sum + lowerBound;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
   int  sum = 0;
    for (int n : numbers){
      sum = sum + n;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
      int sum = sum(lowerBound, upperBound);
    return (double) sum / (upperBound - lowerBound + 1);
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
   int s = 0;
   int i = 0;
   do {
     s = s + numbers[i];
     i++;
   } while (i < numbers.length);

    return (double) s / numbers.length;
  }
}