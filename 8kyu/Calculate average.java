public class Kata{
  public static double find_average(int[] array){
        double sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
   }    
}
