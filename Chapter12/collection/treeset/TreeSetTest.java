package Chapter12.collection.treeset;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> tresSet = new TreeSet<>();

        tresSet.add("2");
        tresSet.add("1");
        
        tresSet.add("3");
        
        for(String t :tresSet){
            System.out.print(t+" ");
        }
        

    }
    
}
