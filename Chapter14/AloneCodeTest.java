package Chapter14;

import Exercise.test;

public class AloneCodeTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Alone_Code {
        if (password == null) {
            throw new Alone_Code("Password cannot be NUll");
        } else if (password.length() < 5) {
            throw new Alone_Code("Password should be longer than 5");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new Alone_Code("Password cannot be only words" );
        }

        this.password = password;

    }

    public static void main(String[] args) {
        AloneCodeTest test = new AloneCodeTest();

        String password = null;
        try {
            test.setPassword(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

        password = "asb2";

        try {
            test.setPassword(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
