package Exercise.Sorting;

public class BubbleSort implements Sort {
    public void ascending(int[] arr) {
        System.out.println("BubbleSort ascending order");
    }

    public void descending(int[] arr) {
        System.out.println("BubbleSort descending order");
    }

    @Override
    public void description() {
        
        Sort.super.description();
    }
}
