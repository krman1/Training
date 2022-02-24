
import java.util.*;

public class Training {


    public static void main(String[] args) {


      List<Integer> a = new ArrayList<>();
      a.add(4);
      a.add(6);
      a.add(5);
      a.add(3);
      a.add(3);
      a.add(1);

      Integer[] tabA = new Integer[a.size()];
      Integer [] max = new Integer[a.size()-1];
      int corectDifference;

      for (int k=0;k<a.size();k++) {
          tabA[k] = a.get(k);
      }
        Arrays.sort(tabA, Collections.reverseOrder());
      for(int i = 0; i<a.size()-1;i++){
          corectDifference = 0;
          for(int j = i;j<a.size()-1;j++){
              Integer difference = tabA[i] - tabA[j+1];
              System.out.println(difference);
              if(Math.abs(difference) <=1){
               corectDifference ++;
              }
          }
          max[i] = corectDifference;

      }
        System.out.println(Arrays.toString(max));
        Arrays.sort(max, Collections.reverseOrder());
        int answer = max[0] + 1;
      System.out.println(Arrays.toString(max));
        System.out.println(answer);






    }
}












