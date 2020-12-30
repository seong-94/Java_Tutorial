package Chapter12.collection;

import java.util.ArrayList;

public class Queue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        queue.showAllQueue();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        

    }
}

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("emphty Queue");
            return null;
        }
        return arrayQueue.remove(0); // 맨 앞으 자료 반환 하고 배열에서 제거
    }

    public void showAllQueue() {
        for (String m : arrayQueue) {
            System.out.print(m);

        }
        System.out.println();
    }
}
