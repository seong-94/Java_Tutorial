package Chapter4;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 9;
        int charge = 0;;
        
        if(age < 8){
            charge += 1000;
        }else if (age <14){
            charge += 2000;
        }else if (age <20){
            charge +=2500;
        }else {
            charge += 3000;
        }
        System.out.println(charge);
    }
}
