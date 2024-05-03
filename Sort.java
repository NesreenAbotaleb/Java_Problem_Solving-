import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class Sort {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        List<Integer> result = getReversed(numbers);

        for (Integer i : result){
            System.out.println(i);
        }
    }
    static List<Integer> getReversed(List<Integer> source) {
        List<Integer> arr = new ArrayList<>(source);
        Collections.reverse(arr);

        return  arr;
    }
}
