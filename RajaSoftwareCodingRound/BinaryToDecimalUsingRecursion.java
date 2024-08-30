public class BinaryToDecimalUsingRecursion{


  public static void main(String args[]){
    String binary = "101";
    System.out.println("decimal : " + getInDecimal(binary , binary.length()-1));
  }

  public static int getInDecimal(String binary , int idx){
    if(idx < 0){
      return 0;
    }

    int bit = binary.charAt(idx) - '0';

    int decimal = bit* (int)Math.pow(2 , binary.length()-1-idx);

    return decimal + getInDecimal(binary , idx-1);
    
  }
}