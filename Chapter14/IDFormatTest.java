package Chapter14;



public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 NULL 일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하 입니다.");
        }
        this.userID = userID;
    }
    public static void main (String[] args){
        IDFormatTest test = new IDFormatTest();

        /** userID 가 NUll 인 경우  */
        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());

        }
        /** 8자 이하 인 경우 */
        userID = "123123"; 
        try {
            test.setUserID(userID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

