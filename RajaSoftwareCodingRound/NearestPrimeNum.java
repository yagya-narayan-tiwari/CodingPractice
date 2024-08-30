public class NearestPrimeNum{
  public static void main(String args[]){
    int num = 127;
    System.out.println(isPrime1(num));

    // int nearestPrimeNum = getNearestPrimeNum(num);
      // System.out.println("Nearest Prime Number to " + num + " is: " + nearestPrimeNum);
  }

  public static int getNearestPrimeNum(int n){
 
    if(n <= 1) return 2;

    int lower = n ;
    int upper = n;

    while(true){
      if(isPrime(lower)) return lower;
      lower--;
      if(isPrime(upper)) return upper;
      upper++;
    }
    
  }

  // normal method to check prime 
  public static boolean isPrime1(int n){
    for(int i = 2 ;  i < n/2 ; i++){
      if(n % i ==0){
        return false;
      }
    }
    return true;
  }

  // optimized method to check prime
  public static boolean isPrime(int n){
    if(n <= 1) return false;
    if(n <=3) return true;

    if(n % 2 == 0 || n % 3 == 0) return false;

    for(int i = 5 ; i * i <= n ; i = i + 6){
      if(n %i == 0 || n % (i+2) == 0){
        return false;
      }
    }
    return true;
  }
}