
import java.util.*;

public class Training {


    public static void main(String[] args) {


      List<Integer> a = new ArrayList<Integer>();
      a.add(73);
      a.add(67);
      a.add(38);
      a.add(33);
      List<Integer> roundedGrade = new ArrayList<>();


      for(int i =0;i<a.size();i++){
          Integer grade = a.get(i);
          int dividedByFive = grade / 5;

         if(grade <38 ){
            roundedGrade.add(grade);
            }
         else {
                if (grade % 5 == 0) {
                    roundedGrade.add(grade);
                } else if (((dividedByFive + 1) * 5) - grade >= 3) {
                    roundedGrade.add(grade);
                } else {
                    Integer newSum = (dividedByFive + 1) * 5;
                    roundedGrade.add(newSum);
                }
         }
      }
      System.out.println(roundedGrade.toString());
    }

}













