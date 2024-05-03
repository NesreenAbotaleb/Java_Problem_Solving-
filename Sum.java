import  java.util.*;
public class Sum {

    public static  double mySum (List<Integer> source){
        if (source == null || source.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Integer i : source){
            sum += i ;
        }
        return  sum / (double)source.size();
    }

    public static double LSum(List<Integer> source){
        if (source == null || source.isEmpty()) {
            return 0;
        }

        return source.stream().reduce(0 , Integer::sum) / (double) source.size();
    }
}
