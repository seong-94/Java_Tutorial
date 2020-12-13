package Chapter7;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java","Android","C","JavaScript","Python"};

        for(String lang : strArray) {
            System.out.println(lang);
        }

        System.out.println(" ");
        
        for(int i = 0 ; i <strArray.length;i++) {
            System.out.println(strArray[i]);
        }
    }
}
