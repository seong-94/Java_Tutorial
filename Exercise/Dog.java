package Exercise;

public class Dog {
    private String name;
    private String type;

    
    Dog(){}
    
    public Dog(String name,String type){
        this.name = name;
        this.type = type;
    }


    public String getname() {
        return name;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setDogType(String type) {
        this.type = type;
    }

    public String showDogInfo() {
        return name + "," + type;
    }


}
