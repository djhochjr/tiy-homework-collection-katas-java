import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


/**
 * Created by davehochstrasser on 8/12/16.
 */
public class Main {
    public static void main(String[] args) throws Exception{


        ArrayList<Integer> ints = new ArrayList<>();

        boolean result = true;
        ints.add(1);
        ints.add(2);
        ints.add(6);

        result = Kata.firstLast6(ints);
        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 6);
        ints.remove(ints.size() - 1);
        ints.add(3);
        result = Kata.firstLast6(ints);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 13);
        result = Kata.firstLast6(ints);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 6);
        result = Kata.firstLast6(ints);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        ints.add(1, 7);
        ints.remove(ints.size() - 2);
        ints.add(ints.size() - 1);
        result = Kata.firstLast6(ints);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        ints.remove(0);
        ints.remove(1);
        result = Kata.firstLast6(ints);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, result);
        System.out.println();

        //ArrayList<Integer> ints = new ArrayList<>();
        ints.clear();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);

        ints.add(1);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);
        ints.remove(ints.size() - 2);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);
        ints.add(4);
        ints.remove(0);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);
        ints.remove(0);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);
        ints.add(6);
        ints.add(25);
        result = Kata.firstLast(ints);
        System.out.printf("Kata.firstLast(%s) -> %s\n", ints, result);
        System.out.println();

        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Kata.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 0, 0));
        System.out.printf("Kata.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(6, 3, 16, 42));
        System.out.printf("Kata.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(6, 47, 89, 100, 256));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 4, 7, 56, 342, 10098));
        System.out.printf("Kata.rotateLeft(%s)", ints);
        Kata.rotateLeft3(ints);
        System.out.printf(" -> %s\n", ints);
        System.out.println();

        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 0, 0));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(7, 8, 9));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(10, 11, 198));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);

        ints.clear();
        ints.addAll(Arrays.asList(11, 11, 1));
        System.out.printf("Kata.reverse3(%s)", ints);
        Kata.reverse3(ints);
        System.out.printf(" -> %s\n", ints);
        System.out.println();

        //ArrayList<Integer>sum = new ArrayList<>();
        int sum = 0;
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(1, 2));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(1, 1, 1, 1));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(1, 3, 7, 12, 26));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(6, 6, 6, 6));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);

        ints.clear();
        ints.addAll(Arrays.asList(2, 4, 10, 0, 11));
        System.out.printf("Kata.sumFirstPenultimate(%s)", ints);
        sum = Kata.sumFirstPenultimate(ints);
        Kata.sumFirstPenultimate(ints);
        System.out.printf(" -> %s\n", sum);
        System.out.println();


        HashMap<String, String> data = new HashMap<>();
        data.put("b", "dirt");
        data.put("a", "candy");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);

        data.clear();
        data.put("b", "dirt");
        data.put("a", "candy");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);

        data.clear();
        data.put("b", "dirt");
        data.put("a", "candy");
        data.put("c", "meh");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);

        data.clear();
        data.put("b", "");
        data.put("a", "");
        data.put("c", "meh");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);

        data.clear();
        data.put("b", "");
        data.put("a", "snookie");
        data.put("c", "ball");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);

        data.clear();
        data.put("b", "dirt");
        data.put("a", "bag");
        data.put("c", "guys");
        System.out.printf("Kata.mapBully(%s) -> ", data);
        data = Kata.mapBully(data);
        System.out.printf("%s\n", data);


        System.out.println();

        data.clear();
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);

        map.clear();
        //data.put("a", "aaa");
        map.put("b", "xyz");
        map.put("c", "ccc");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);

        map.clear();
        map.put("d", "hi");
        map.put("a", "aaa");
        map.put("c", "meh");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);

        map.clear();
        map.put("a", "hi");
        map.put("b", "");
        map.put("c", "guy");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);

        map.clear();
        map.put("a", "def");
        map.put("b", "pdq");
        map.put("e", "xyz");
        map.put("c", "sat");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);

        map.clear();
        map.put("a", "dog");
        map.put("b", "cat");
        map.put("e", "pig");
        map.put("c", "cow");
        System.out.printf("Kata.mapShare(%s) -> ", map);
        map = Kata.mapShare(map);
        System.out.printf("%s\n", map);
        System.out.println();

        data.clear();
        HashMap<String, String> datas = new HashMap<>();
        datas.put("a", "There");
        datas.put("b", "Hi");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);

        datas.clear();
        //datas.put("a", "There");
        datas.put("a", "Hi");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);

        datas.clear();
        datas.put("b", "There");
        //datas.put("b", "Hi");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);

        datas.clear();
        datas.put("a", "There");
        datas.put("b", "Hussy");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);

        datas.clear();
        datas.put("a", "There");
        datas.put("b", "Hits");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);

        datas.clear();
        datas.put("a", "Their");
        datas.put("b", "Hi");
        System.out.printf("Kata.mapAB(%s) -> ", datas);
        datas = Kata.mapAB(datas);
        System.out.printf("%s\n", datas);


        ArrayList<String>words = new ArrayList<>();
        words.addAll(Arrays.asList("this", "and","that","and"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        System.out.printf("%s\n", Kata.wordLen(words) );

        words.clear();
        words.addAll(Arrays.asList("a", "bb","b","aa"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        //words = Kata.wordLen(words);
        System.out.printf("%s\n", Kata.wordLen(words) );

        words.clear();
        words.addAll(Arrays.asList("code", "code","code","bug"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        System.out.printf("%s\n", Kata.wordLen(words) );

        words.clear();
        words.addAll(Arrays.asList("dave","dave","dave","dave"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        System.out.printf("%s\n", Kata.wordLen(words) );

        words.clear();
        words.addAll(Arrays.asList("I","us","you","them","all"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        System.out.printf("%s\n", Kata.wordLen(words) );

        words.clear();
        words.addAll(Arrays.asList("bill","bob","chuck","trevor","charlotte"));
        System.out.printf("Kata.wordLen(%s) -> ", words);
        System.out.printf("%s\n", Kata.wordLen(words) );
        System.out.println();

        ArrayList<String>words1 = new ArrayList<>();
        words1.addAll(Arrays.asList("aardvark","apple","zamboni","phone"));
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.add("turkey");
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.add("");
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.addAll(Arrays.asList("Catherine", "Bill", "Karl", "Kevin", "Kyle", "Camille"));
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.addAll(Arrays.asList("doody", "doug", "hammer", "Hank", "Annie"));
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.addAll(Arrays.asList("j", "Johnnie", "jericho", "Jezabel", "Marvin", "Mel"));
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

        words1.clear();
        words1.add("elephant");
        System.out.printf("Kata.indexWords(%s) -> ", words1);
        System.out.printf("%s\n", Kata.indexWords(words1) );

    }

}
