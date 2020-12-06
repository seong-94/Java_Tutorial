package chapter2;

public class TypeInference {
    public static void main(String[] args) {
        var i = 10; // var i is compiled to int i 
        var j = 10.0; // var j is compiled to double j
        var str = "hello"; // var str is compiled to String str = "hello"

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        System.out.println(str);
        //str = 3; str is already compiled String so java can not 
        
    }
}
