package Exercise.Sorting;

public interface Sort  {
    void ascending(int[] arr);
    void descending(int[] arr);

    default void description(){
        System.out.println("숫자 를 정렬 하는 알고리즘 입니다.");
    }
 

}
