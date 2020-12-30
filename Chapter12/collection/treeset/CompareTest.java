package Chapter12.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CompareTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
}

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}