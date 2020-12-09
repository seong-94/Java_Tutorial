package Chapter6;

public class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }

    public static class ThisExample {
        public static void main(String[] args) {
            Birthday birthday1 = new Birthday();
            birthday1.setYear(2000);
            System.out.println(birthday1);
            birthday1.printThis();
        }
    }
}
