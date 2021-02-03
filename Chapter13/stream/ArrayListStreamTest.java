package Chapter13.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();//  스트림 생성
        stream.forEach(String -> System.out.println(String + " ")); // 배열의 요소를 하나씩 출력
        System.out.println();
        
        sList.stream().sorted().forEach(s -> System.out.println(s)); // sList.stream() 스트림을 새로 생성/ sorted() 정렬 / forEach(s -> System.out.println(s) 요소를 하나씩 꺼내어 출력           
                                                                     
    }
}
