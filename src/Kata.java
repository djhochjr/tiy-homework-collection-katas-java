import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


/**
 * Created by davehochstrasser on 8/12/16.
 */
public class Kata {
    public static boolean firstLast(ArrayList<Integer> ints) {
        return ints.get(0).equals(ints.get(ints.size() - 1));

    }

    public static boolean firstLast6(ArrayList<Integer> ints) {
        return ints.get(0).equals(6) || (ints.get(ints.size() - 1).equals(6));

    }

    public static void rotateLeft3(ArrayList<Integer> ints) {
        Collections.rotate(ints, ints.size() - 2);
    }

    public static void reverse3(ArrayList<Integer> ints) {
        Collections.reverse(ints);
    }

    public static int sumFirstPenultimate(ArrayList<Integer> ints) {
        //int sum = Kata.sumFirstPenultimate(ints);

        if (ints.size() >= 2) {
            return ints.get(0) + ints.get(ints.size() - 2);
        } else if (ints.size() == 1) {
            return ints.get(0);
        }
        return 0;
    }


    public static HashMap<String, String> mapBully(HashMap<String, String> data) {
        if (data.containsKey("a")) {
            //data.replace("b", data.get("a"));
            data.put("b", (data.get("a")));
            data.put("a", "");
        }
        return data;

    }

    public static HashMap<String, String> mapShare(HashMap<String, String> map) {
        if (map.containsKey("a")) {
            //map.replace("b", map.get("a"));

            map.put("b", (map.get("a")));
            //map.put("a", "");
            map.remove("c");
        }
        return map;
    }

    public static HashMap<String, String> mapAB(HashMap<String, String> datas) {
        if ((datas.containsKey("a")) & (datas.containsKey("b"))) {

            datas.put("ab", (datas.get("b")) + (datas.get("a")));
            //datas.put("b",(datas.get("a")));
            //datas.put("a",(datas.get("b")));
        }
        return datas;
    }

    public static HashMap<String, Integer> wordLen(ArrayList<String> words) {
        HashMap<String, Integer> data1 = new HashMap<>();
        for (String word : words)
            if (!data1.containsKey(word)) {
                data1.put(word, (word.length()));
            }
        return data1;
    }

    public static HashMap<String, ArrayList<String>> indexWords(ArrayList<String> Words) {
        HashMap<String, ArrayList<String>> newWords = new HashMap<>();
        for (String word : Words) {
            if ((word.length()> 0) && (!newWords.containsKey(word.charAt(0)))) {
                String letter = "" + word.charAt(0);
                newWords.put(letter, new ArrayList<>());

            }

        }

        for (String word2 : Words) {
            if (word2.length()>0){
            String letter = "" + word2.charAt(0);
            if (newWords.get(letter) != null) {
                ArrayList<String> wordList = newWords.get(letter);
                wordList.add(word2);
            }}
        }

        return newWords;
    }
}




































