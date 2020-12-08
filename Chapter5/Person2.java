package Chapter5;

public class Person2 {
  String name;
  float height;
  float weight;

  public Person2() {
  } // default constructor 생성자를 직접 구현한 경우에는 default 생성자가 필요
  // 자바 컴파일러는 생거자가 하나도 없는경우애만 디폴트 생성자를 제공

  public Person2(String pname, float height, float weight) {
    this.name = pname;
    this.height = height;
    this.weight = weight;
  }

}
