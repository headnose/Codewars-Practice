public class Kata{
  
  public static String binaryAddition(int a, int b){
    int sum = a + b;
    String binary = Integer.toBinaryString(sum); 
    return binary.toString();
  }
}