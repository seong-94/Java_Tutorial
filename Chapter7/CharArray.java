package Chapter7;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i = 0; i < alphabets.length; i++, ch++){
            alphabets[i] = ch; // ch is stored as ASC11 code
        }
        for(int i = 0; i <alphabets.length; i++){
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}
