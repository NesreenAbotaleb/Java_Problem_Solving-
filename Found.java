import java.util.*;

public class Found {

    public static void main(String[] args) {
        String source = "Here is an example.Right here.";
        String word = "here";

        System.out.println(founding(source , word));
        System.out.println(Cfound(source , word));
    }
    //My Solution
    public static int founding(String source , String word){
        int count = 0 ;
        String [] words = source.split("\\b");


        for (String s : words) {
            if (word.equalsIgnoreCase(s))
                count++;
        }

        return count;
    }

    //Another Solution

     public static int Cfound(String source , String word){

        String CleanString = source.replaceAll("\\." , "");

         return (int) Arrays.stream(CleanString.split(" "))
                .filter(w -> w.equalsIgnoreCase(word)).count();
    }
}
