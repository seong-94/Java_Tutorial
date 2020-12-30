package Chapter12.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();// powder 형으로 GenericPrinter 클래스 생성
        // <> 안에 material 에 상속 받지 않은 자료형은 사용할수 없다. 제한을 걸었기 떄문에
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();// plastic 형으로 GenericPrinter 클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
