import java.util.*;
import java.util.stream.Collectors;

public class checkLength {

    public static void main(String[] args) {
        String source = "there are both smaller and bigger words here";
        List<String> result = myCheck(source);
    }

    public static List<String> myCheck(String source){
        if(source.isEmpty()){
            return new ArrayList<>();
        }

        List<String> arr = new ArrayList<>();
        arr = Arrays.asList(source.split(" "));

        List<String> res = new ArrayList<>();

        for (String i : arr){
            if (i.length() <= 5){
                res.add(i);
            }
        }
        return res;
    }

    public static List<String> LCheck(String source){
        return Arrays.stream(source.split(" ")).filter(w -> w.length() <= 5).collect(Collectors.toList());
    }
}
