package Chapter13.stream;

import java.util.function.BinaryOperator;
import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {
        
        String[] greetings = {"안녕하세요~~~~~~~","Hello","Good Morning", "반갑습니다."};
        
        /** 람다실을 직접 구현 하는 방법 */
        System.out.println(Arrays.stream(greetings).reduce("", (s1,s2)->{
            if(s1.getBytes().length >= s2.getBytes().length)
            return s1;
            else return s2;
        }));    

        /** BinaryOperator 를 구현한 클래스 사용 */
        String str = Arrays.stream(greetings).reduce(new compareString()).get();
        System.out.println(str);
       

        
    }
}
/** BinaryOperator 를 구현 하는 클래스 정의 */
class compareString implements BinaryOperator<String> {
    
    /** reduce() 메서드가 호출 될때 불리는 메서드 두 문자 열 길이를 비교  */
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else
            return s2;
    };
    
    
}

