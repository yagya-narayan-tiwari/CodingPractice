public class StringToNumWithOutInbuilt{
  public static void main(String args[]){
    String str = "123";
    int num = 0;
    for(int i = 0 ; i < str.length() ; i++){
      System.out.println(str.charAt(i)- '0');
      num = num*10 + (str.charAt(i) - '0');
    }
    System.out.println(num);
  }
}