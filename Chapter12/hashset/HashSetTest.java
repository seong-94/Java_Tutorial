package Chapter12.hashset;

import java.util.HashSet;



public class HashSetTest {
    public static void main(String[] args) {//hashset 클래서는 집합 자료구조를 구혀나면 중복을허용하지 않습니다.
        HashSet<String> hashset = new HashSet<>();
        hashset.add(new String ("1"));
        hashset.add(new String ("2"));
        hashset.add(new String ("3"));
        hashset.add(new String ("4"));
        hashset.add(new String ("5"));
        hashset.add(new String ("1"));

        System.out.println(hashset);

        
    }
}
