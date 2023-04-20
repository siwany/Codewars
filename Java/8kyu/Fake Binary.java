public class FakeBinary {
  public static String fakeBin(String numberString) {
    String result = "";
    for(char ch : numberString.toCharArray()) {
       result += Character.getNumericValue(ch) < 5 ? "0": "1";
    }
    return result;
  }
}
