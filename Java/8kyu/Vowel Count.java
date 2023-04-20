public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    for(char ch: str.toCharArray()){
      count += (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;
    }
    return count;
  }

}
