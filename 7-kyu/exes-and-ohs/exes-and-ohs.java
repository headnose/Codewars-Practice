public class XO {
​
  public static boolean getXO(String str) {
    int xCount = 0;
    int oCount = 0;
​
    str = str.toLowerCase();
​
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'x') {
        xCount++;
      } else if (c == 'o') {
        oCount++;
      }
    }
​
    return xCount == oCount;
  }
​
}
​