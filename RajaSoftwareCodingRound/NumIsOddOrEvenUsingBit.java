public class NumIsOddOrEvenUsingBit {

  public static void main(String[] args) {
    int number = 29;  // Example number

    if (isOdd(number)) {
      System.out.println(number + " is odd.");
    } else {
      System.out.println(number + " is even.");
    }
  }

  public static boolean isOdd(int num) {
    // Use bitwise AND to check if the least significant bit is 1
    return (num & 1) == 1;
  }
}
