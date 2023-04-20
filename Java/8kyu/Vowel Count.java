public class Vowels {

  public static int getCount(String str) {
    int num = 0;
    for(int a = 0; a < str.length(); a++){
      if(str.charAt(a)=='a'||str.charAt(a)=='e'||str.charAt(a)=='u'||str.charAt(a)=='o'||str.charAt(a)=='i'){
        num ++;
      }
    }
    return num;
  }

}
