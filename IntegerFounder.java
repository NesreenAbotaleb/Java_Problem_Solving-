import java.util.*;
public class IntegerFounder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 55 );
        int targetSum = 26;
        List<Integer> result = myFounder(numbers, targetSum);
    }
    public static List<Integer> myFounder(List<Integer> source , int target){
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ; i < source.size() ; i ++){
            for(int j = i + 1 ; j < source.size() ; j++){
                if (source.get(i) + source.get(j) == target){
                    res.add(i);
                    res.add(j);
                }
            }
        }

        return res;
    }

    public static List<Integer> LFounder(List<Integer> source , int target){
        Map<Integer , Integer> sourceMap = new HashMap<>();
        for (int i = 0; i < source.size(); i++) {
            sourceMap.put(source.get(i),i);
        }
        for (int i = 0; i < source.size(); i++) {
            int sol = target - source.get(i);
            if (sourceMap.containsKey(sol) && source.get(sol) != i){
                return Arrays.asList(sol , i);
            }
        }
        return Arrays.asList(-1 , -1);
    }
}
