import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Training {


    public static void main(String[] args) {


        int maxHeight = 0;
        List<Integer> candles = new ArrayList<>();


        candles.add(3);
        candles.add(3);
        candles.add(3);
        candles.add(3);


        Collections.reverse(candles);
        System.out.println(candles);
        Collections.sort(candles);
        System.out.println(candles);


 Integer highestCandle = candles.get(candles.size()-1);
        for(int i = 0; i<candles.size(); i++){
            if (candles.get(i)==highestCandle) {
                maxHeight++;
            }
            }
        System.out.println(maxHeight);
        }

    }













